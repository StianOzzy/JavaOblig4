
import Unrunable.TVSeriesJSONRepository;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import Unrunable.TVSeries;

public class JSONMain {

    /*
    Lag også en kjørbar klasse kalt JSONMain med en main-metode.
    Vi vil oppdatere denne som vi implementerer logikken for metodene.
     */

    public static void main(String[] args) {

        /*
        I den kjørbare klassen JSONMain, opprett et objekt av TVSeriesJSONRepository
        og send med et File-objekt med filnavnet "tvseries.json".
         */

        TVSeriesJSONRepository tVSeriesJSONRepository1 = new TVSeriesJSONRepository(new File("tvseries.json"));


        /*
        Etter implementasjonen er ferdig, i JSONMain, opprett/benytt en liste med
        noen TVSeries-objekter og skriv denne listen til fil ved hjelp av addListOfTVSeries().
         */

        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(new TVSeries("Breaking Bad", "A chemistry teacher breaks bad", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "The battle for the iron throne", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "Strange things happening.", LocalDate.of(2016, 7, 15)));

        tVSeriesJSONRepository1.addListOfTVSeries(tvSeriesList);


        /*
        Skriv logikken for getAllTVSeries() slik at vi kan hente en liste med TVSeries-objekter
        fra JSON-fil. Test bruk av den implementerte metoden i JSONMain.
         */

        ArrayList<TVSeries> seriesInJSONFile = tVSeriesJSONRepository1.getAllTVSeries();
        System.out.println("\n\nAll TVSeries objects in JSON file:");
        for (TVSeries tvSeriesObject : seriesInJSONFile) {
            System.out.println(tvSeriesObject);
        }


        /*
        Skriv logikken for getTVSeriesByTitle() slik at vi kan hente ett spesifikt TVSeries-objekt.
        Merk at det ikke er så lett å "søke etter" og hente ut ett enkelt objekt fra en JSON-liste
        direkte. Hvordan kan likevel oppnå dette? Test bruk av den implementerte metoden i JSONMain.
         */

        TVSeries series = tVSeriesJSONRepository1.getTVSeriesByTitle("Breaking Bad");
        System.out.println("\n\nChecking to see if Breaking Bad can be found by title...");
        if (series != null) {
            System.out.println("TVSeries-object found: " + series);
        } else {
            System.out.println("TVSeries-object found.");
            System.out.println("null");
        }

    }
}
