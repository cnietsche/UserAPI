package br.com.cnietsche.userapi.application.dto.user;

import java.time.LocalDate;
import java.util.UUID;

public class GetUserResponseDTO {

    private final UUID id;
    private final String userName;
    private final LocalDate expirationDate;
    private final UUID naturalPersonId;

    public GetUserResponseDTO(UUID id, String userName, LocalDate expirationDate, UUID naturalPersonId) {
        this.id = id;
        this.userName = userName;
        this.expirationDate = expirationDate;
        this.naturalPersonId = naturalPersonId;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public UUID getNaturalPersonId() {
        return naturalPersonId;
    }
}
