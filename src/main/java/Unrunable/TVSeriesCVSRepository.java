package Unrunable;

import java.io.*;
import java.util.ArrayList;

public class TVSeriesCVSRepository implements TVSeriesRepository {

    /*
    Opprett en ny klasse TVSeriesCSVRepository. Denne skal kunne bli benyttet for å lese
    og lagre TVSeries-objekter med CSV-filer. Sett klassen til å implementere interfacet
    TVSeriesRepository og sørg for at alle metodene fra interfacet blir Overridet
    (ikke tenk på implementasjon helt enda).
     */

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        /*
        Implementer logikken for metoden addListOfTVSeries(ArrayList<TVSeries>).
        Skriv hvert TVSeries-objekt i listen mottatt med parameter til fil med CSV-format.
        Sørg for at hvert objekt lagres på hver sin linje og at verdiene som lagres skilles
        med et fast skilletegn. Du kan velge skilletegnet selv, men det kan i det minste være
        fornuftig å velge et tegn som typisk ikke benyttes i vanlig skriftlig språk.
         */

        try (FileWriter fileWriter = new FileWriter("tvseries.csv")) {
            for (TVSeries series : listOfTVSeries) {
                fileWriter.write(series.toCSV() + "\n");
            }
            System.out.println("TV-series written to tvseries.csv");
        } catch (IOException e) {
            System.err.println("Error writing to file " + e.getMessage());
        }
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {

        /*
        Implementer logikken for metoden getAllTVSeries(). Skriv denne slik at den oppretter,
        fyller og returner en en liste med TVSeries-objekter basert på informasjonen i CSV-filen.
        Dette innebærer at du må lese filen linje for linje og benytte de forskjellige verdiene
        til å opprette "nye" objekter. Hvis det ikke finnes noen TV-serier i filen, returner en
        tom liste.
         */
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("tvseries.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                TVSeries series = TVSeries.fromCSV(line);
                if (series != null) {
                    tvSeriesList.add(series);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return tvSeriesList;
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        /*
        Implementer logikken for metoden getTVSeriesByTitle(String title).
        Logikken vil nok ligne mye på det i getAllTVSeries(), men skriv her
        logikken slik at metoden bare returnerer det TVSeries-objektet med
        tilsvarende tittel som i parameteren. Hvis TV-serien som det søkes
        etter ikke blir funnet, returner null (nøkkelordet, ikke tallet).
         */
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("tvseries.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                TVSeries tvSeries = TVSeries.fromCSV(line);
                if (tvSeries != null && tvSeries.getTitle().equalsIgnoreCase(title)) {
                    return tvSeries;
                }
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra fil: " + e.getMessage());
        }
        return null;
    }

    /*
    I TVSeriesCSVRepository, opprett en instansvariabel, file som skal være et objekt av typen File,
    og en konstruktør som tar imot og setter objektet for denne instansvariabelen.
    De videre metodene vi skal implementere vil skrive og lese denne filen.
     */

    public File file;

    public TVSeriesCVSRepository (File file) {
        this.file=file;
    }

}
