package br.com.cnietsche.userapi.application.dto.request.user;

import java.time.LocalDate;
import java.util.Objects;

public class CreateUserWithNaturalPersonRequestDTO {

    private final String userName;
    private final String password;

    private final String name;
    private final String personalIdentification;
    private final LocalDate dateOfBirth;

    public CreateUserWithNaturalPersonRequestDTO(
            String userName,
            String password,
            String name,
            String personalIdentification,
            LocalDate dateOfBirth
    ) {
        this.userName = Objects.requireNonNull(userName, "userName must not be null");
        this.password = Objects.requireNonNull(password, "password must not be null");
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.personalIdentification = Objects.requireNonNull(personalIdentification, "personalIdentification must not be null");
        this.dateOfBirth = Objects.requireNonNull(dateOfBirth, "dateOfBirth must not be null");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
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
