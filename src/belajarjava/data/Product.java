package belajarjava.data;

public class Product {

    // Protected hanya bisa diakses di dalam class, sub class dan package yang sama
    // Private hanya bisa diakses di dalam class yang sama
    protected String name;
    protected Integer price;

    Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
