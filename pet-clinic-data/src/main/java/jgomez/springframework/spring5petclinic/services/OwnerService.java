package jgomez.springframework.spring5petclinic.services;

import jgomez.springframework.spring5petclinic.model.Owner;

/**
 * Interface OwnerService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
