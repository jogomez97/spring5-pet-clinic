package jgomez.springframework.spring5petclinic.bootstrap;

import jgomez.springframework.spring5petclinic.model.Owner;
import jgomez.springframework.spring5petclinic.model.PetType;
import jgomez.springframework.spring5petclinic.model.Vet;
import jgomez.springframework.spring5petclinic.services.OwnerService;
import jgomez.springframework.spring5petclinic.services.PetTypeService;
import jgomez.springframework.spring5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Class DataLoader
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);     // store the object with auto-generated ID

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Joan");
        owner1.setLastName("Gomez");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Katherine");
        owner2.setLastName("Clark");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Connor");
        vet1.setLastName("Morse");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Fay");
        vet2.setLastName("Sherman");

        vetService.save(vet2);

        System.out.println("Loaded bootstrap data");

    }

}
