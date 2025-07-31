package br.com.cnietsche.userapi.application.usecase.naturalperson.impl;

import br.com.cnietsche.userapi.application.usecase.naturalperson.GetNaturalPersonByIdUseCase;
import br.com.cnietsche.userapi.domain.exception.NaturalPersonNotFoundException;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;
import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPersonRepository;

import java.util.UUID;

public class GetNaturalPersonByIdUseCaseImpl implements GetNaturalPersonByIdUseCase {

    private final NaturalPersonRepository naturalPersonRepository;

    public GetNaturalPersonByIdUseCaseImpl(NaturalPersonRepository naturalPersonRepository) {
        this.naturalPersonRepository = naturalPersonRepository;
    }

    @Override
    public NaturalPerson getById(UUID id) {
        return naturalPersonRepository.findById(id)
                .orElseThrow(NaturalPersonNotFoundException::new);
    }
}
