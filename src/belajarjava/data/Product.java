package belajarjava.data;

public class Product {

    // Protected hanya bisa diakses di dalam class, sub class dan package yang sama
    // Private hanya bisa diakses di dalam class yang sama
    public String name;
    public Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // toString() method 
    @Override
    public String toString(){
        return name + " - " + price;
    }
}
