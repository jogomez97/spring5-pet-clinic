package jgomez.springframework.spring5petclinic.services.map;

import jgomez.springframework.spring5petclinic.model.Owner;
import jgomez.springframework.spring5petclinic.model.Pet;
import jgomez.springframework.spring5petclinic.services.OwnerService;
import jgomez.springframework.spring5petclinic.services.PetService;
import jgomez.springframework.spring5petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Class OwnerServiceMap
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        if (owner != null) {
            // Make sure associated Pets have correct data
            if (owner.getPets() != null) {
                owner.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        // If PetType assigned has not been saved
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("PetType is required");
                    }

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(owner);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
