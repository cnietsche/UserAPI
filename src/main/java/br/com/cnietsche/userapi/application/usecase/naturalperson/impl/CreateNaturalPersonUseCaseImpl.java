package br.com.cnietsche.userapi.application.usecase.naturalperson.impl;

import br.com.cnietsche.userapi.application.usecase.naturalperson.CreateNaturalPersonUseCase;
import br.com.cnietsche.userapi.domain.exception.PersonalIdentificationAlreadyExistsException;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPersonRepository;

import java.util.UUID;

public class CreateNaturalPersonUseCaseImpl implements CreateNaturalPersonUseCase {

    private final NaturalPersonRepository naturalPersonRepository;

    public CreateNaturalPersonUseCaseImpl(NaturalPersonRepository naturalPersonRepository) {
        this.naturalPersonRepository = naturalPersonRepository;
    }

    @Override
    public NaturalPerson create(NaturalPerson naturalPerson) {
        if (naturalPersonRepository.existsByPersonalIdentification(naturalPerson.getPersonalIdentification())) {
            throw new PersonalIdentificationAlreadyExistsException();
        }

        if (naturalPerson.getId() == null) {
            naturalPerson = new NaturalPerson(
                    UUID.randomUUID(),
                    naturalPerson.getName(),
                    naturalPerson.getDateOfBirth(),
                    naturalPerson.getPersonalIdentification()
            );
        }

        naturalPersonRepository.save(naturalPerson);

        return naturalPerson;
    }
}
