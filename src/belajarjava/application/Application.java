package belajarjava.application;

// Import digunakan untuk memanggil class di luar package nya
// import belajarjava.data.Product; //  hanya mengimport 1 class saja
import belajarjava.data.*; // Mengimport semua class

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 1000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
