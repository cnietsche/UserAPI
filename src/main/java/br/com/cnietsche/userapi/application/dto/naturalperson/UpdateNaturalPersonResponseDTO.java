package br.com.cnietsche.userapi.application.dto.naturalperson;

import java.time.LocalDate;
import java.util.UUID;

public class UpdateNaturalPersonResponseDTO {

    private final UUID id;
    private final String name;
    private final String personalIdentification;
    private final LocalDate dateOfBirth;

    public UpdateNaturalPersonResponseDTO(UUID id, String name, String personalIdentification, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.personalIdentification = personalIdentification;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
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
