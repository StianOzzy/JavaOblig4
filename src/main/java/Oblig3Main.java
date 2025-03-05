import Unrunable.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Oblig3Main {

    public static void main(String[] args) {

        // Oppgave 2.2 - Movie
        Movie Gladiator = new Movie("Gladiator", 155);
        Movie Rocky = new Movie("Rocky", 135);
        Movie Jaws = new Movie("Jaws",124);

        System.out.printf("\n(Printing info about various movie objects)\n");
        System.out.println(Gladiator);
        System.out.println(Rocky);
        System.out.println(Jaws);

        // Oppgave 2.4 - Regissør
        System.out.println("\n\n(Adding directors to Movie and Episode objects)\n");
        Person ridleyScott = new Person("Ridley","Scott");
        Gladiator.setDirector(ridleyScott);
        System.out.println("Gladiator director: " + Gladiator.getDirector());

        Person johnGAvildsen = new Person("John", "G. Avildsen");
        Rocky.setDirector(johnGAvildsen);

        Person stevenSpielberg = new Person("Steven", "Spielberg");
        Jaws.setDirector(stevenSpielberg);

        // Creating a TVSeries object
        TVSeries GameOfThrones = new TVSeries("Game of Thrones", "A great show", LocalDate.of(2011,4,17));

        // Creating Episode objects of the TVSeries object
        Episode GoT_S1E1 = new Episode("Episode 1", 60, 1,1);
        Episode GoT_S1E2 = new Episode("Episode 2", 60, 1,1);
        Episode GoT_S1E3 = new Episode("Episode 3", 60, 1,1);
        GameOfThrones.addEpisode(GoT_S1E1);
        GameOfThrones.addEpisode(GoT_S1E2);
        GameOfThrones.addEpisode(GoT_S1E3);

        Person timothyVanPatten = new Person("Timothy", "Van Patten");
        GoT_S1E1.setDirector(timothyVanPatten);
        GoT_S1E2.setDirector(timothyVanPatten);
        GoT_S1E3.setDirector(timothyVanPatten);
        System.out.println("GoT_S1E1 director: " + GoT_S1E1.getDirector());

        // Oppgave 2.5 - Roller
        System.out.println("\n\n(Adding roles to Movie objects)\n");

        // Testing with a single object first
        Person rusellCrowe = new Person("Rusell", "Crowe");
        Role maximus = new Role("Maximus", "Decimus", rusellCrowe);
        Gladiator.addToRoles(maximus);
        System.out.println(Gladiator.getRoles());

        ArrayList<Role> listOfManyRoles = new ArrayList<>();
        Person sylvesterStallone = new Person("Sylvester","Stallone");
        Role rocky = new Role("Rocky","Balboa",sylvesterStallone);
        Person carlWeathers = new Person("Carl", "Weathers");
        Role apolloCreed = new Role("Apollo","Creed", carlWeathers);
        listOfManyRoles.add(rocky);
        listOfManyRoles.add(apolloCreed);
        Rocky.addToRoles(listOfManyRoles);
        System.out.println(Rocky.getRoles());

        // Oppgave 2.7 - Hente alle roller

        // Adding 3 different actors to 3 different roles, in 3 different episodes

        // Ned Stark (Sean Bean) goes into episode 1
        Person seanBean = new Person("Sean", "Bean");
        Role nedStark = new Role("Ned","Stark",seanBean);
        GoT_S1E1.addToRoles(nedStark);

        // Tyrion Lannister (Peter Dinklage) goes into episode 2
        Person peterDinklage = new Person("Peter", "Dinklage");
        Role tyrionLannister = new Role("Tyrion", "Lannister",peterDinklage);
        GoT_S1E2.addToRoles(tyrionLannister);

        // Jon Snow (Kit Harington) goes into episode 3
        Person kitHarington = new Person("Kit", "Harington");
        Role jonSnow = new Role("Jon","Snow",kitHarington);
        GoT_S1E1.addToRoles(jonSnow);
        GoT_S1E3.addToRoles(jonSnow);

        // All different roles from the TVSeries object are printed with hentRollebesetning()
        System.out.println("\n\n(Adding roles from different Episodes of a TVSeries into a common list)\n");
        System.out.println(GameOfThrones.hentRollebesetning());

    }

}
