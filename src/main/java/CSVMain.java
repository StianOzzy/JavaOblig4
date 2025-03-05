import Unrunable.TVSeriesCVSRepository;

import java.io.File;

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
        
    }
}
