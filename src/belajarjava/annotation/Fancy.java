package belajarjava.annotation;

import java.lang.annotation.*;

// Anotation dalam oop digunakan untuk  menandai informasi untuk sebuah class atau method dengan kata kunci @
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String[] tags() default {};
}
