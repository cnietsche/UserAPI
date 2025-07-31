package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.AuthenticateUserUseCase;
import br.com.cnietsche.userapi.domain.exception.AuthenticationFailedException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;

public class AuthenticateUserUseCaseImpl implements AuthenticateUserUseCase {

    private final UserRepository userRepository;

    public AuthenticateUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User authenticate(String userName, String password) {
        return userRepository.findByUserName(userName)
                .filter(user -> user.getPassword().equals(password))
                .orElseThrow(AuthenticationFailedException::new);
    }
}
