package jgomez.springframework.spring5petclinic.model;

import java.io.Serializable;

/**
 * Class BaseEntity
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
