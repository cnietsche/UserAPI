package br.com.cnietsche.userapi.domain.model.user;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class User {

    private final UUID id;
    private String userName;
    private String password;
    private LocalDate expirationDate;
    private UUID naturalPersonId;

    public User(UUID id, String userName, String password, LocalDate expirationDate, UUID naturalPersonId) {
        this.id = Objects.requireNonNull(id, "ID cannot be null");
        this.userName = Objects.requireNonNull(userName, "User Name cannot be null");
        this.password = Objects.requireNonNull(password, "Password cannot be null");
        this.expirationDate = Objects.requireNonNull(expirationDate, "Expiration Date cannot be null");
        this.naturalPersonId = Objects.requireNonNull(naturalPersonId, "Natural Person ID cannot be null");
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = Objects.requireNonNull(userName, "User Name cannot be null");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Objects.requireNonNull(password, "Password cannot be null");
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = Objects.requireNonNull(expirationDate, "Expiration Date cannot be null");
    }

    public UUID getNaturalPersonId() {
        return naturalPersonId;
    }

    public void setNaturalPersonId(UUID naturalPersonId) {
        this.naturalPersonId = Objects.requireNonNull(naturalPersonId, "Natural Person ID cannot be null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
