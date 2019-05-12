package abbas.springframework.springpetclinic.bootstrap;

import abbas.springframework.springpetclinic.model.Owner;
import abbas.springframework.springpetclinic.model.Vet;
import abbas.springframework.springpetclinic.services.OwnerService;
import abbas.springframework.springpetclinic.services.VetService;
import abbas.springframework.springpetclinic.services.map.OwnerMapService;
import abbas.springframework.springpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    public final OwnerService ownerService;
    public final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
                Owner one = new Owner();
                one.setId(1L);
                one.setFirstName("Abbas");
                one.setLastName("Ogaji");

                ownerService.save(one);

                Owner one2 = new Owner();
                one2.setId(2L);
                one2.setFirstName("Yusuf");
                one2.setLastName("Yahaya");

                ownerService.save(one2);
                System.out.println("Loaded Owners ........");

                Vet vet = new Vet();
                vet.setId(1L);
                vet.setFirstName("Abdulkarim");
                vet.setLastName("Ogaji");

                vetService.save(vet);

                Vet vet2 = new Vet();
                vet2.setId(2L);
                vet2.setFirstName("Dauda");
                vet2.setLastName("Garba");

                vetService.save(vet);
                System.out.println("Loaded Vets ........");


    }
}
