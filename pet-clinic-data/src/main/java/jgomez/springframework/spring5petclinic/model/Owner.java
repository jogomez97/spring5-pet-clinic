package jgomez.springframework.spring5petclinic.model;

import java.util.Set;

/**
 * Class Owner
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
