package abbas.springframework.springpetclinic.services;

import abbas.springframework.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
