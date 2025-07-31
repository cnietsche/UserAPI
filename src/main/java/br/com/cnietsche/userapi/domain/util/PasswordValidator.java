package br.com.cnietsche.userapi.domain.util;

public class PasswordValidator {

    private static final String UPPERCASE_PATTERN = ".*[A-Z].*";
    private static final String SPECIAL_CHAR_PATTERN = ".*[^a-zA-Z0-9].*";
    private static final String NUMBER_PATTERN = ".*\\d.*";
    private static final int MIN_LENGTH = 6;

    public static boolean isValid(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            return false;
        }

        return password.matches(UPPERCASE_PATTERN) &&
                password.matches(SPECIAL_CHAR_PATTERN) &&
                password.matches(NUMBER_PATTERN);
    }
}
