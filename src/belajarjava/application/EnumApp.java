package belajarjava.application;

import belajarjava.data.Customer;
import belajarjava.data.Level;

public class EnumApp {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Thomas");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
    }
}
