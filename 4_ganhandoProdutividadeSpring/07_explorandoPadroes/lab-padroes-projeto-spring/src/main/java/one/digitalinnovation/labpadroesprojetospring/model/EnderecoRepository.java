package one.digitalinnovation.labpadroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Cliente,Long> {
}
