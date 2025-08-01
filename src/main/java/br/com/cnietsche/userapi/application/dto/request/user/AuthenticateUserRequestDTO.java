package br.com.cnietsche.userapi.application.dto.request.user;

public class AuthenticateUserRequestDTO {

    private final String userName;
    private final String password;

    public AuthenticateUserRequestDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
