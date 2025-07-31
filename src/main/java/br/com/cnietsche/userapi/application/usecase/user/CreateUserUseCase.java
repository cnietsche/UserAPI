package br.com.cnietsche.userapi.application.usecase.user;

import br.com.cnietsche.userapi.domain.model.user.User;

public interface CreateUserUseCase {

    User create(User user);
}
