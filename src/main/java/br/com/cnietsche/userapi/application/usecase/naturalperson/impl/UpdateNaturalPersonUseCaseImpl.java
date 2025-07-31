package br.com.cnietsche.userapi.application.usecase.naturalperson.impl;

import br.com.cnietsche.userapi.application.usecase.naturalperson.UpdateNaturalPersonUseCase;
import br.com.cnietsche.userapi.domain.exception.NaturalPersonNotFoundException;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPersonRepository;

import java.util.UUID;

public class UpdateNaturalPersonUseCaseImpl implements UpdateNaturalPersonUseCase {

    private final NaturalPersonRepository naturalPersonRepository;

    public UpdateNaturalPersonUseCaseImpl(NaturalPersonRepository naturalPersonRepository) {
        this.naturalPersonRepository = naturalPersonRepository;
    }


    @Override
    public NaturalPerson update(NaturalPerson naturalPerson) {
        UUID id = naturalPerson.getId();

        NaturalPerson existing = naturalPersonRepository.findById(id)
                .orElseThrow(NaturalPersonNotFoundException::new);

        existing.setName(naturalPerson.getName());
        existing.setDateOfBirth(naturalPerson.getDateOfBirth());

        naturalPersonRepository.update(existing);

        return existing;
    }
}
