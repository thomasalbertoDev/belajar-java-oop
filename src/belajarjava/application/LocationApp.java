package belajarjava.application;

import belajarjava.data.*;

public class LocationApp {

    public static void main(String[] args) {
        // var location = new Location(); // Error, karena class Location adalah abstract class

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
