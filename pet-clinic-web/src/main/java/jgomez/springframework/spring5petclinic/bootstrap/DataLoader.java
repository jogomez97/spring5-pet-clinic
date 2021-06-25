package jgomez.springframework.spring5petclinic.bootstrap;

import jgomez.springframework.spring5petclinic.model.Owner;
import jgomez.springframework.spring5petclinic.model.Vet;
import jgomez.springframework.spring5petclinic.services.OwnerService;
import jgomez.springframework.spring5petclinic.services.VetService;
import jgomez.springframework.spring5petclinic.services.map.OwnerServiceMap;
import jgomez.springframework.spring5petclinic.services.map.VetServiceMap;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Joan");
        owner1.setLastName("Gomez");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Katherine");
        owner2.setLastName("Clark");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Connor");
        vet1.setLastName("Morse");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Fay");
        vet2.setLastName("Sherman");

        vetService.save(vet2);

        System.out.println("Loaded bootstrap data");

    }

}
