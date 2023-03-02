package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (password.matches("^[^0-9]*$")) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (password.matches("^[A-Za-z0-9]*$")) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] forbidden = {"qwerty", "12345", "password", "admin", "user"};
        for (String banned : forbidden) {
            if (password.toLowerCase().contains(banned)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
