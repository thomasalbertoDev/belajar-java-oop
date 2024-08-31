package belajarjava.application;

import belajarjava.data.LoginRequest;
import belajarjava.error.ValidationException;
import belajarjava.util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
