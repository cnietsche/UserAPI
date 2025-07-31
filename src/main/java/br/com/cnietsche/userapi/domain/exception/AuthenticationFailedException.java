package br.com.cnietsche.userapi.domain.exception;

public class AuthenticationFailedException extends RuntimeException {

    public AuthenticationFailedException() {
        super("Invalid user name or password");
    }
}
