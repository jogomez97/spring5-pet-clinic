package jgomez.springframework.spring5petclinic.bootstrap;

import jgomez.springframework.spring5petclinic.model.*;
import jgomez.springframework.spring5petclinic.services.OwnerService;
import jgomez.springframework.spring5petclinic.services.PetTypeService;
import jgomez.springframework.spring5petclinic.services.SpecialtyService;
import jgomez.springframework.spring5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if there is already persistent data in place
        int count = ownerService.findAll().size() + vetService.findAll().size() + petTypeService.findAll().size() + specialtyService.findAll().size();
        if (count == 0) loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);     // store the object with auto-generated ID

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);
        Specialty surgery = new Specialty("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);
        Specialty dentistry = new Specialty("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Joan");
        owner1.setLastName("Gomez");
        owner1.setAddress("3448 Faucibus Ave");
        owner1.setCity("Penicuik");
        owner1.setTelephone("16350324 4679");

        Pet joansPet = new Pet();
        joansPet.setName("Obi");
        joansPet.setPetType(savedDogPetType);
        joansPet.setOwner(owner1);
        joansPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(joansPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Katherine");
        owner2.setLastName("Clark");
        owner2.setAddress("188-7967 Elit, Rd.");
        owner2.setCity("Ruthin");
        owner2.setTelephone("16380801 0759");

        Pet katsPet = new Pet();
        katsPet.setName("Minino");
        katsPet.setPetType(savedCatPetType);
        katsPet.setOwner(owner2);
        katsPet.setBirthDate(LocalDate.ofYearDay(2010, 185));
        owner2.getPets().add(katsPet);

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Connor");
        vet1.setLastName("Morse");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Fay");
        vet2.setLastName("Sherman");
        vet2.getSpecialties().add(savedSurgery);
        vet2.getSpecialties().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded bootstrap data");
    }

}
