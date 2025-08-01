package br.com.cnietsche.userapi.application.dto.naturalperson;

import java.time.LocalDate;
import java.util.UUID;

public class UpdateNaturalPersonRequestDTO {

    private final UUID id;
    private final String name;
    private final LocalDate dateOfBirth;

    public UpdateNaturalPersonRequestDTO(UUID id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
