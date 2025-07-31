package br.com.cnietsche.userapi.domain.exception;

public class PersonalIdentificationAlreadyExistsException extends RuntimeException {

    public PersonalIdentificationAlreadyExistsException() {
        super("Personal Identification already exists");
    }

    public PersonalIdentificationAlreadyExistsException(String message) {
        super(message);
    }
}
