package jgomez.springframework.spring5petclinic.services;

import jgomez.springframework.spring5petclinic.model.Owner;

import java.util.Set;

/**
 * Interface OwnerService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
