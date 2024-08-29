package belajarjava.util;

public class MathUtil {

    // TODO: Static merupakan kemampuan untuk membuat field, method atau Inner class bisa diakses langsung tanpa melalui object nya.
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }
}
