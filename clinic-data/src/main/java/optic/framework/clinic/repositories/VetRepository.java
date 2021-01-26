package optic.framework.clinic.repositories;

import optic.framework.clinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}