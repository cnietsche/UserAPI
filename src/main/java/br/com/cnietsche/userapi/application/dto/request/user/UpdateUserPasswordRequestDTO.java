package br.com.cnietsche.userapi.application.dto.request.user;

import java.util.UUID;

public class UpdateUserPasswordRequestDTO {

    private final UUID userId;
    private final String newPassword;

    public UpdateUserPasswordRequestDTO(UUID userId, String newPassword) {
        this.userId = userId;
        this.newPassword = newPassword;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
