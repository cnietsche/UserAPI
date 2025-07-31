package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.GetUserByUserNameUseCase;
import br.com.cnietsche.userapi.domain.exception.UserNotFoundException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;

public class GetUserByUserNameUseCaseImpl implements GetUserByUserNameUseCase {

    private final UserRepository userRepository;

    public GetUserByUserNameUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName)
                .orElseThrow(UserNotFoundException::new);
    }
}
