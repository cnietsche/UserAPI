package br.com.cnietsche.userapi.application.dto.response.user;

import java.util.UUID;

public class AuthenticateUserResponseDTO {

    private final UUID id;
    private final String userName;
    private final UUID naturalPersonId;
    private final boolean passwordExpired;

    public AuthenticateUserResponseDTO(UUID id, String userName, UUID naturalPersonId, boolean passwordExpired) {
        this.id = id;
        this.userName = userName;
        this.naturalPersonId = naturalPersonId;
        this.passwordExpired = passwordExpired;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public UUID getNaturalPersonId() {
        return naturalPersonId;
    }

    public boolean isPasswordExpired() {
        return passwordExpired;
    }
}
