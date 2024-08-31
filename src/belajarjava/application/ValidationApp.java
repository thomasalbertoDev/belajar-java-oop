package belajarjava.application;

import belajarjava.data.LoginRequest;
import belajarjava.error.ValidationException;
import belajarjava.util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {
        // Exception
        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Runtime Exception
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Done");
    }
}
