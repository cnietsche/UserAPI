package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.GetUserByIdUseCase;
import br.com.cnietsche.userapi.domain.exception.UserNotFoundException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;

import java.util.UUID;

public class GetUserByIdUseCaseImpl implements GetUserByIdUseCase {

    private final UserRepository userRepository;

    public GetUserByIdUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(UUID userId) {
        return userRepository.findById(userId)
                .orElseThrow(UserNotFoundException::new);
    }
}
