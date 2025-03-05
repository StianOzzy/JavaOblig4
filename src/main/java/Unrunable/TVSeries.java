package Unrunable;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {

    private String title;           // TV-seriens tittel
    private String description;     // En beskrivelse av TV-serien
    private LocalDate releaseDate;  // TV-seriens utgivelsesdato
    private ArrayList<Episode> episodes = new ArrayList<>();     // epiosder i serien
    private int averageRunTime;
    private int numSeasons;



    // CONSTRUCTORS

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }



    // METHODS

    public ArrayList<Role> hentRollebesetning() {
        ArrayList<Role> allRoles = new ArrayList<>();
        for (int i = 0; i < episodes.size(); i++) {
            allRoles.addAll(episodes.get(i).getRoles());
        }
        return allRoles;
    }

    // Oppgave 2.6 - toString()
    @Override
    public String toString() {
        return "\n--TVSeries info--" +
                "\nTitle: " + title +
                "\nDescription: " + description +
                "\nRelease Date: " + releaseDate +
                "\nEpisodes: " + episodes.size();
    }

    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> episodesFromSeason = new ArrayList<>();
        for (int i = 0; i < episodes.size(); i++) {
            if (episodes.get(i).getSeasonNumber() == season) {
                episodesFromSeason.add(episodes.get(i));
            }
        }
        return episodesFromSeason;
    }

    public void addEpisode(Episode episode) {
        if (episode.getSeasonNumber() - 1 > getNumSeasons()) {
            System.out.println("Error - season out of bound");
        }
        else if (episode.getSeasonNumber() - 1 == getNumSeasons()) {
            this.numSeasons += 1;
            this.episodes.add(episode);
            updateAverageRuntime();
        }
        else {
            this.episodes.add(episode);
            updateAverageRuntime();
        }
    }

    private void updateAverageRuntime() {
        int totalRuntime = 0;
        for (int i = 0; i < episodes.size(); i++) {
            totalRuntime += episodes.get(i).getRuntime();
        }
        this.averageRunTime = totalRuntime / episodes.size();
    }



    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisode(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }

    public int getAverageRunTime() {
        return averageRunTime;
    }

    public int getNumSeasons() {
        return numSeasons;
    }
}
