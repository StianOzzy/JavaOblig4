// Oppgave 2.1 - Production

package Unrunable;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Production {
    private String title;           // Episodens tittel
    private int runtime;            // Episodens spilletid i minutter

    // Oppgave 2.3 - Utvide klasser
    private String description;
    private LocalDate releaseDate;

    // Oppgave 2.4 - Regissør
    private Person director;

    // Oppgave 2.5 - Roller
    private ArrayList<Role> roles = new ArrayList<>();



    // CONSTRUCTORS

    public Production(String title) {
        this.title = title;
    }

    public Production(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    // Oppgave 2.3 - Utvide klasser
    public Production(String title, int runtime, String description, LocalDate releaseDate) {
        this.title = title;
        this.runtime = runtime;
        this.description = description;
        this.releaseDate = releaseDate;
    }



    // METHODS

    // Oppgave 2.6 - toString()
    @Override
    public String toString() {
        return "Production title: " + title;
    }

    public ArrayList<Role> getRoles() {
        // Returns a copy of the  roles list
        ArrayList<Role> roles_copy = roles;
        return roles_copy;
    }

    public void addToRoles(Role role) {
        this.roles.add(role);
    }

    public void addToRoles(ArrayList<Role> listOfRoles) {
        this.roles.addAll(listOfRoles);
    }



    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
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

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }


}