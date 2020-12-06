package optic.framework.clinic.services;

import optic.framework.clinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
