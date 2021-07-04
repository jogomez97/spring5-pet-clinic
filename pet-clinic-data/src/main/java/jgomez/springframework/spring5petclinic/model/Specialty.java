package jgomez.springframework.spring5petclinic.model;

/**
 * Class Specialty
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
