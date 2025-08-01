package br.com.cnietsche.userapi.application.vo;

import br.com.cnietsche.userapi.domain.model.user.User;

public class AuthenticationResult {

    private final User user;
    private final boolean passwordExpired;

    public AuthenticationResult(User user, boolean passwordExpired) {
        this.user = user;
        this.passwordExpired = passwordExpired;
    }

    public User getUser() {
        return user;
    }

    public boolean isPasswordExpired() {
        return passwordExpired;
    }
}
