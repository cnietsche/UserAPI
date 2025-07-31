package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.UpdateUserPasswordUseCase;
import br.com.cnietsche.userapi.domain.exception.InvalidPasswordException;
import br.com.cnietsche.userapi.domain.exception.UserNotFoundException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;
import br.com.cnietsche.userapi.domain.util.PasswordValidator;

import java.time.LocalDate;
import java.util.UUID;

public class UpdateUserPasswordUseCaseImpl implements UpdateUserPasswordUseCase {

    private final UserRepository userRepository;

    public UpdateUserPasswordUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void updatePassword(UUID userId, String newPassword) {
        if (!PasswordValidator.isValid(newPassword)) {
            throw new InvalidPasswordException();
        }

        User user = userRepository.findById(userId)
                .orElseThrow(UserNotFoundException::new);

        user.setPassword(newPassword);
        user.setExpirationDate(LocalDate.now().plusDays(30));

        userRepository.update(user);
    }
}
