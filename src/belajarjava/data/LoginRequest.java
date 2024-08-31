package belajarjava.data;

// Record class digunakan untuk mendefinisikan kelas yang berfungsi sebagai "data carrier", yang secara otomatis menghasilkan beberapa boilerplate code seperti getter, equals(), hashCode(), dan toString() method.
public record LoginRequest(String username, String password) {

    // Compact Constructor (Constructor tanpa parameter dan tanda () )
    // public LoginRequest  {
    //     System.out.println("Record Constructor");
    // }

    // Record Overloading
    public LoginRequest(String username) {
        this(username, "password");
    }

}
