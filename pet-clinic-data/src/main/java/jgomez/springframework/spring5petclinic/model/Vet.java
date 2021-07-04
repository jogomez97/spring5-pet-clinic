package jgomez.springframework.spring5petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Class Vet
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
