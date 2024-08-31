package belajarjava.util;

import belajarjava.data.LoginRequest;
import belajarjava.error.BlankException;
import belajarjava.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {

        if (loginRequest.username() == null || loginRequest.username().isEmpty()) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.password() == null || loginRequest.password().isEmpty()) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().length() < 6) {
            throw new ValidationException("password must be at least 6 characters");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {

        if (loginRequest.username() == null || loginRequest.username().isEmpty()) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.password() == null || loginRequest.password().isEmpty()) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("username is blank");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("password is blank");
        }
    }
}
