package cloud.folium.internship.equalshashcode;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Person)) return false;

        Person p2 = (Person) obj;
        return firstName.equalsIgnoreCase(p2.getFirstName()) && lastName.equalsIgnoreCase(p2.getLastName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}
