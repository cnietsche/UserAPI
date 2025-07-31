package br.com.cnietsche.userapi.domain.exception;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException() {
        super("Password must be at least 6 characters long and contain at least one uppercase letter, one special character, and one number");
    }

    public InvalidPasswordException(String message) {
        super(message);
    }
}
