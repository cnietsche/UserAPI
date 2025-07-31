package br.com.cnietsche.userapi.domain.exception;

public class NaturalPersonNotFoundException extends RuntimeException {

    public NaturalPersonNotFoundException() {
        super("Natural Person not found");
    }

    public NaturalPersonNotFoundException(String message) {
        super(message);
    }
}
