package belajarjava.application;

import belajarjava.data.Animal;
import belajarjava.data.Cat;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Kitty";
        animal.run();
    }
}
