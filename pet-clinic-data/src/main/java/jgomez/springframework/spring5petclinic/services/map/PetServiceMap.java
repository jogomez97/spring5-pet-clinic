package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.Pet;
import jgomez.springframework.spring5petclinic.services.CrudService;
import jgomez.springframework.spring5petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Class PetServiceMap
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
