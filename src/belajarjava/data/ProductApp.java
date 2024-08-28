package belajarjava.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 1000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
