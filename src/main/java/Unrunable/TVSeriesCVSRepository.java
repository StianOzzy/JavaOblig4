package Unrunable;

import java.io.File;
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

    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return null;
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
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
