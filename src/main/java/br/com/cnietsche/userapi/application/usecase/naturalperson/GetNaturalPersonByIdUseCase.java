package br.com.cnietsche.userapi.application.usecase.naturalperson;

import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;

import java.util.UUID;

public interface GetNaturalPersonByIdUseCase {

    NaturalPerson getById(UUID id);
}
