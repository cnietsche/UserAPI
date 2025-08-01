package br.com.cnietsche.userapi.application.dto.user;

import java.util.UUID;

public class CreateUserResponseDTO {

    private final UUID id;
    private final String userName;
    private final UUID naturalPersonId;

    public CreateUserResponseDTO(UUID id, String userName, UUID naturalPersonId) {
        this.id = id;
        this.userName = userName;
        this.naturalPersonId = naturalPersonId;
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
}
