package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.Specialty;
import jgomez.springframework.spring5petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Class SpecialtyMapService
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
