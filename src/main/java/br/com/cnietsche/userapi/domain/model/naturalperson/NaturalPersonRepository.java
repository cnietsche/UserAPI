package br.com.cnietsche.userapi.domain.model.naturalperson;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NaturalPersonRepository {

    Optional<NaturalPerson> findById(UUID id);

    Optional<NaturalPerson> findByPersonalIdentification(String personalIdentification);

    List<NaturalPerson> findAll();

    void save(NaturalPerson naturalPerson);

    void update(NaturalPerson naturalPerson);

    void deleteById(UUID id);

    boolean existsByPersonalIdentification(String personalIdentification);
}
