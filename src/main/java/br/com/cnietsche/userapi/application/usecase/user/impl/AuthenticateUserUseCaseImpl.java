package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.AuthenticateUserUseCase;
import br.com.cnietsche.userapi.application.vo.AuthenticationResult;
import br.com.cnietsche.userapi.domain.exception.AuthenticationFailedException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;

import java.time.LocalDate;

public class AuthenticateUserUseCaseImpl implements AuthenticateUserUseCase {

    private final UserRepository userRepository;

    public AuthenticateUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AuthenticationResult authenticate(String userName, String password) {
        User user = userRepository.findByUserName(userName)
                .filter(u -> u.getPassword().equals(password))
                .orElseThrow(AuthenticationFailedException::new);

        boolean passwordExpired = user.getExpirationDate() == null || user.getExpirationDate().isBefore(LocalDate.now());

        return new AuthenticationResult(user, passwordExpired);
    }
}
