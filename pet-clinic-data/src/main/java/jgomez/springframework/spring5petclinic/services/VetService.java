package jgomez.springframework.spring5petclinic.services;

import jgomez.springframework.spring5petclinic.model.Vet;

import java.util.Set;

/**
 * Interface VetService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
