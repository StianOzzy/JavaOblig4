package Unrunable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TVSeriesJSONRepository implements TVSeriesRepository {


    /*
    Opprett en ny klasse TVSeriesJSONRepository. Denne skal kunne bli benyttet for å lese og
    lagre TVSeries-objekter med JSON-filer. Sett klassen til å implementere interfacet
    TVSeriesRepository og sørg for at alle metodene fra interfacet blir Overridet.
     */


    /*
    Implementer logikken for metoden addListOfTVSeries(ArrayList<TVSeries>).
    Som i en tidligere implementasjon skal metoden skrive listen med TVSeries-objekter
    til fil, men her i JSON-format.
     */

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            objectMapper.writeValue(file, listOfTVSeries);
            System.out.println("TV-serier skrevet til JSON-fil: " + file.getName());
        } catch (IOException e) {
            System.err.println("Feil ved skriving til JSON-fil: " + e.getMessage());
        }
    }


    /*
    Skriv logikken for getAllTVSeries() slik at vi kan hente en liste med TVSeries-objekter fra JSON-fil.
     */

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        try {
            return this.objectMapper.readValue(file,
            this.objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, TVSeries.class));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    /*
    Skriv logikken for getTVSeriesByTitle() slik at vi kan hente ett spesifikt TVSeries-objekt.
     */

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        ArrayList<TVSeries> seriesList = getAllTVSeries();
        for (TVSeries series : seriesList) {
            if (series.getTitle().equals(title)) {
                return series;
            }
        }
        return null;
    }


    /*
    Som du gjorde i Oppgave 2.3 a) tidligere, opprett en instansvariabel, file av typen File,
    og en konstruktør som tar imot og setter objektet for denne instansvariabelen i
    TVSeriesJSONRepository. Benytt denne instansvariabelen ved lesing og skriving til fil i
    de videre metode-implementasjonene.
     */

    private final File file;
    private final ObjectMapper objectMapper;

    public TVSeriesJSONRepository (File file) {
        this.file=file;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
}
