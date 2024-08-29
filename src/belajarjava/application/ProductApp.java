package belajarjava.application;

import belajarjava.data.Product;

public class ProductApp {

    public static void main(String[] args) {
        Product product = new Product("Indomie", 1000);
        Product product2 = new Product("Sosis", 5000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        // HashCode method merupakan method yang membandingkan isi dari object tapi hanya object yang memiliki tipe data integer
        System.out.println(product.hashCode() == product2.hashCode());

    }
}
