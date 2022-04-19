package cloud.folium.internship.equalshashcode;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(
                "Meiram Sopy",
                "Temirzhanov");
        Person p2 = new Person(
                "Meiram Sopy",
                "Temirzhanov");
        Person p3 = new Person(
                "Aisara",
                "Alimova");


        Set<Person> persons = new HashSet<Person>();
        persons.add(p1);
        persons.add(p1);
        persons.add(p2);
        persons.add(p2);
        persons.add(p3);

        System.out.printf("Set has %d elements", persons.size());
        System.out.println();
        System.out.println("p1 equals to p2: " + p1.equals(p2));
        System.out.println("p1 equals to p3: " + p1.equals(p3));

        System.out.println("p1 hashcode: " + p1.hashCode());
        System.out.println("p2 hashcode: " + p2.hashCode());
        System.out.println("p3 hashcode: " + p3.hashCode());




    }
}
