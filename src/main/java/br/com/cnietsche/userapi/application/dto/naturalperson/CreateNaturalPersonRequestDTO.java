package br.com.cnietsche.userapi.application.dto.naturalperson;

import java.time.LocalDate;

public class CreateNaturalPersonRequestDTO {

    private final String name;
    private final String personalIdentification;
    private final LocalDate dateOfBirth;

    public CreateNaturalPersonRequestDTO(String name, String personalIdentification, LocalDate dateOfBirth) {
        this.name = name;
        this.personalIdentification = personalIdentification;
        this.dateOfBirth = dateOfBirth;
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
