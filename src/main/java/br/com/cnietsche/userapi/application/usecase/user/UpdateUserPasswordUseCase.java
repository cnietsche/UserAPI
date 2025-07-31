package br.com.cnietsche.userapi.application.usecase.user;

import java.util.UUID;

public interface UpdateUserPasswordUseCase {

    void updatePassword(UUID userId, String newPassword);
}
