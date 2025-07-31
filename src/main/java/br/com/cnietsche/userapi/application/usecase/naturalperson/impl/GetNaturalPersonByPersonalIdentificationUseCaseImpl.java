package br.com.cnietsche.userapi.application.usecase.naturalperson.impl;

import br.com.cnietsche.userapi.application.usecase.naturalperson.GetNaturalPersonByPersonalIdentificationUseCase;
import br.com.cnietsche.userapi.domain.exception.NaturalPersonNotFoundException;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPersonRepository;

public class GetNaturalPersonByPersonalIdentificationUseCaseImpl implements GetNaturalPersonByPersonalIdentificationUseCase {

    private final NaturalPersonRepository naturalPersonRepository;

    public GetNaturalPersonByPersonalIdentificationUseCaseImpl(NaturalPersonRepository naturalPersonRepository) {
        this.naturalPersonRepository = naturalPersonRepository;
    }

    @Override
    public NaturalPerson getByPersonalIdentification(String personalIdentification) {
        return naturalPersonRepository.findByPersonalIdentification(personalIdentification)
                .orElseThrow(NaturalPersonNotFoundException::new);
    }
}
