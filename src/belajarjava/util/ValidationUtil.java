package belajarjava.util;

import belajarjava.annotation.NotBlank;
import belajarjava.data.LoginRequest;
import belajarjava.error.BlankException;
import belajarjava.error.ValidationException;
import java.lang.reflect.Field;

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

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {

            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }

                } catch (IllegalAccessException e) {
                    System.out.println("Error : " + e.getMessage());
                }
            }
        }
    }
}
