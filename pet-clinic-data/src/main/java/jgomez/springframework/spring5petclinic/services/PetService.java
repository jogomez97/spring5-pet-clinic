package jgomez.springframework.spring5petclinic.services;

import jgomez.springframework.spring5petclinic.model.Pet;

import java.util.Set;

/**
 * Interface PetService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
