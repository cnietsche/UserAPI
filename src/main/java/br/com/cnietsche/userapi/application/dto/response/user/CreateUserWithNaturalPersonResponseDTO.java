package br.com.cnietsche.userapi.application.dto.response.user;

import java.time.LocalDate;
import java.util.UUID;

public class CreateUserWithNaturalPersonResponseDTO {

    private final UUID userId;
    private final String userName;

    private final UUID naturalPersonId;
    private final String name;
    private final String personalIdentification;
    private final LocalDate dateOfBirth;

    public CreateUserWithNaturalPersonResponseDTO(
            UUID userId,
            String userName,
            UUID naturalPersonId,
            String name,
            String personalIdentification,
            LocalDate dateOfBirth
    ) {
        this.userId = userId;
        this.userName = userName;
        this.naturalPersonId = naturalPersonId;
        this.name = name;
        this.personalIdentification = personalIdentification;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public UUID getNaturalPersonId() {
        return naturalPersonId;
    }

    public String getName() {
        return name;
    }

    public String getPersonalIdentification() {
        return personalIdentification;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
