package br.com.cnietsche.userapi.application.usecase.user.impl;

import br.com.cnietsche.userapi.application.usecase.user.CreateUserUseCase;
import br.com.cnietsche.userapi.domain.exception.InvalidPasswordException;
import br.com.cnietsche.userapi.domain.exception.UserNameAlreadyExistsException;
import br.com.cnietsche.userapi.domain.model.user.User;
import br.com.cnietsche.userapi.domain.model.user.UserRepository;
import br.com.cnietsche.userapi.domain.util.PasswordValidator;

import java.time.LocalDate;
import java.util.UUID;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepository userRepository;

    public CreateUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        if (!PasswordValidator.isValid(user.getPassword())) {
            throw new InvalidPasswordException();
        }

        if (userRepository.existsByUserName(user.getUserName())) {
            throw new UserNameAlreadyExistsException();
        }

        UUID id = UUID.randomUUID();
        LocalDate expirationDate = LocalDate.now().plusDays(30);

        User userToSave = new User(
                id,
                user.getUserName(),
                user.getPassword(),
                expirationDate,
                user.getNaturalPersonId()
        );

        userRepository.save(userToSave);

        return userToSave;
    }
}
