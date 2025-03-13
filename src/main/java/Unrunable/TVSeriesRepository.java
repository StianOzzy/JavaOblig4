package Unrunable;

import java.io.File;
import java.util.ArrayList;

public interface TVSeriesRepository {
    /*
    addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) - Skal ta imot en ArrayList med TVSeries-objekter og lagre disse.
    getAllTVSeries() - Skal returnere en ArrayList med alle lagrede TVSeries-objekter
    getTVSeriesByTitle(String title) - Skal returnere et TVSeries-objekt basert på den spesifiserte tittelen.
     */

    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    

    public ArrayList<TVSeries> getAllTVSeries();

    public TVSeries getTVSeriesByTitle(String title);


}
