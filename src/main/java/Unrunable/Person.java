// Oppgave 2.4 - Regissør

package Unrunable;

public class Person {

    private String firstName;
    private String lastName;



    // CONSTRUCTORS

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    // METHODS

    // Oppgave 2.6 - toString()
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }



    // GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }
}
