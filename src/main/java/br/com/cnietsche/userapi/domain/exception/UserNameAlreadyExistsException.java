package br.com.cnietsche.userapi.domain.exception;

public class UserNameAlreadyExistsException extends RuntimeException {

    public UserNameAlreadyExistsException() {
        super("User Name already exists");
    }

    public UserNameAlreadyExistsException(String message) {
        super(message);
    }
}
