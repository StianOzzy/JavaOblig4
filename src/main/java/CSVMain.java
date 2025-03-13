import Unrunable.TVSeriesCVSRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import Unrunable.TVSeries;



public class CSVMain {

    /*
    Lag også en kjørbar klasse kalt CSVMain med en main-metode.
    Vi vil oppdatere denne som vi implementerer logikken for metodene.
     */

    public static void main(String[] args) {

        /*
        I den kjørbare klassen CSVMain, opprett et objekt av TVSeriesCSVRepository
        og send med et File-objekt med filnavnet "tvseries.csv".
         */

        TVSeriesCVSRepository tvSeriesCVSRepository1 = new TVSeriesCVSRepository(new File("tvseries.csv"));


        /*
        I den kjørbare klassen CSVMain, opprett en liste med noen TVSeries-objekter
        og skriv denne listen til fil ved hjelp av addListOfTVSeries().
         */

        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(new TVSeries("Breaking Bad", "A chemistry teacher breaks bad", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "The battle for the iron throne", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "Strange things happening.", LocalDate.of(2016, 7, 15)));

        tvSeriesCVSRepository1.addListOfTVSeries(tvSeriesList);


        /*
        I den kjørbare klassen CSVMain, benytt getAllTVSeries() for å hente ut de objektene
        som du skrev til fil i Oppgave 2.3 b). Skriv ut en beskrivelse for hver av disse for
        å bekrefte at objektene innholder riktig informasjon.
         */

        ArrayList<TVSeries> seriesInFile = tvSeriesCVSRepository1.getAllTVSeries();
        System.out.println("TV-serier hentet fra fil:");
        for (TVSeries series : seriesInFile) {
            System.out.println(series);
        }


        /*
        I den kjørbare klassen CSVMain, benytt getTVSeriesByTitle() for å hente
        ut en spesifikk TV-serie fra CSV-filen. Skriv ut en beskrivelse av dette
        objektet for å demonstrere at metoden fungerer.
         */



        TVSeries tvSeriesObject = tvSeriesCVSRepository1.getTVSeriesByTitle("Game of Thrones");
        System.out.println("\n\nChecking to see if TVSeries-object exists...");
        if (tvSeriesObject != null) {
            System.out.println("TVSeries-object was found:");
            System.out.println(tvSeriesObject);
        } else {
            System.out.println("TVSeries-object was not found:");
            System.out.println("null");
        }
    }
}
