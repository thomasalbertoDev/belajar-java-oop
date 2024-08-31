package belajarjava.util;

import belajarjava.data.LoginRequest;
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
}
