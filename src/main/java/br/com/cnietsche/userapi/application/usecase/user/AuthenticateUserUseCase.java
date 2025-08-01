package br.com.cnietsche.userapi.application.usecase.user;

import br.com.cnietsche.userapi.application.vo.AuthenticationResult;

public interface AuthenticateUserUseCase {

    AuthenticationResult authenticate(String userName, String password);
}
