package belajarjava.application;

import belajarjava.data.Application;
import belajarjava.data.Constant;
import belajarjava.data.Country;
import belajarjava.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        // Memanggil field static
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        // Memanggil method static
        System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Memanggil Inner Class static
        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
