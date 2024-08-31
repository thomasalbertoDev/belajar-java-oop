package belajarjava.application;

public class StackTraceApp {

    // Stack Trace Element Class digunakan untuk mengetahui error yang lebih lengkap pada kode program kita
    public static void main(String[] args) {
        try {
            String[] names = {
                "Thomas", "Alberto"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
