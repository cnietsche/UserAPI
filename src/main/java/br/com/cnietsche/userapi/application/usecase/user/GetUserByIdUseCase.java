package br.com.cnietsche.userapi.application.usecase.user;

import br.com.cnietsche.userapi.domain.model.user.User;

import java.util.UUID;

public interface GetUserByIdUseCase {

    User getById(UUID userId);
}
