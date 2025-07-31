package br.com.cnietsche.userapi.domain.model.naturalperson;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class NaturalPerson {

    private final UUID id;
    private String name;
    private LocalDate dateOfBirth;

    public NaturalPerson(UUID id, String name, LocalDate dateOfBirth) {
        this.id = Objects.requireNonNull(id, "ID cannot be null");
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.dateOfBirth = Objects.requireNonNull(dateOfBirth, "Date of Birth cannot be null");
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = Objects.requireNonNull(dateOfBirth, "Date of Birth cannot be null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaturalPerson)) return false;
        NaturalPerson naturalPerson = (NaturalPerson) o;
        return Objects.equals(id, naturalPerson.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
