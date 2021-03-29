import Models.Database;
import TestTables.Car;
import TestTables.Person;
import TestTables.Song;

import java.time.LocalDate;

public class Driver {


    public static void main(String[] args) {

        Car c1 = new Car(1000, "Car1", "2002", 10);
        Car c2 = new Car(50, "Car2", "2005", 10);
        Car c3 = new Car(25, "Car3 ", "2006", 10);
        Car c4 = new Car(123, "Car4 ", "2500", 11);

        Song s1 = new Song(1, "Insert Song name here", 123123, "Akon");

        Person p1 = new Person(10, LocalDate.now(), "Mario", "Plumber");
        Person p2 = new Person(20, LocalDate.now(), "Charles", "Barkley");

        Person p3 = new Person(30, LocalDate.now(), "Messi", "Leo");
        Person p4 = new Person(33, LocalDate.now(), "Ronaldo", "Cris");


        Database db = new Database();




        db.close();


    }
}




