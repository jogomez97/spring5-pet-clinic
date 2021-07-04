package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.PetType;
import jgomez.springframework.spring5petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Class PetTypeMapService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
