package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.Vet;
import jgomez.springframework.spring5petclinic.services.CrudService;
import jgomez.springframework.spring5petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Class VetServiceMap
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
