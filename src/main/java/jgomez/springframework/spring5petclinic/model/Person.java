package jgomez.springframework.spring5petclinic.model;

/**
 * Class Person
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public class Person {

    private String firstName;
    private String lastName;
    
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
