package jgomez.springframework.spring5petclinic.services;


import java.util.Set;

/**
 * Interface CrudService - Implements custom generic CRUD interface inspired in CrudRepository
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
