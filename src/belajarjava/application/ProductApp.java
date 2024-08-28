package belajarjava.application;

import belajarjava.data.Product;

public class ProductApp {

    public static void main(String[] args) {
        Product product = new Product("Indomie", 1000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
    }
}
