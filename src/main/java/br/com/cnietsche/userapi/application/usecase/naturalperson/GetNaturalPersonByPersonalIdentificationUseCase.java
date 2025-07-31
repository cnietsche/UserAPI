package br.com.cnietsche.userapi.application.usecase.naturalperson;

import br.com.cnietsche.userapi.domain.model.naturalperson.NaturalPerson;

public interface GetNaturalPersonByPersonalIdentificationUseCase {

    NaturalPerson getByPersonalIdentification(String personalIdentification);
}
