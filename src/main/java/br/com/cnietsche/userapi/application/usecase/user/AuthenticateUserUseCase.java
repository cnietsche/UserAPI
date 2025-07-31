package br.com.cnietsche.userapi.application.usecase.user;

import br.com.cnietsche.userapi.domain.model.user.User;

public interface AuthenticateUserUseCase {

    User authenticate(String userName, String password);
}
