package br.com.cnietsche.userapi.application.dto.user;

import java.util.UUID;

public class CreateUserRequestDTO {

    private final UUID naturalPersonId;
    private final String userName;
    private final String password;

    public CreateUserRequestDTO(UUID naturalPersonId, String userName, String password) {
        this.naturalPersonId = naturalPersonId;
        this.userName = userName;
        this.password = password;
    }

    public UUID getNaturalPersonId() {
        return naturalPersonId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
