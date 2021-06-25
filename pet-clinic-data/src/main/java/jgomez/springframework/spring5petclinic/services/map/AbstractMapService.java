package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.BaseEntity;

import java.util.*;

/**
 * Class AbstractMapService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Stored Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet());
        } catch (NoSuchElementException e) {
            nextId = 0L;
        }

        return nextId + 1;
    }

}
