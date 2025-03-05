// Oppgave 2.2 - Movie

package Unrunable;

import java.time.LocalDate;

public class Movie extends Production {



    // CONSTRUCTORS

    public Movie(String title) {
        super(title);
    }

    public Movie(String title, int runtime) {
        super(title, runtime);
    }

    // Oppgave 2.3 - Utvide klasser
    public Movie(String title, int runtime, String description, LocalDate releaseDate) {
        super(title, runtime, description, releaseDate);
    }



    // METHODS

    // Oppgave 2.6 - toString()
    @Override
    public String toString() {
        return "\n--Movie info--" +
                "\nTitle: " + this.getTitle() +
                "\nRuntime: " + this.getRuntime();
    }
}
