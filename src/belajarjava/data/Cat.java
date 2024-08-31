package belajarjava.data;

import belajarjava.annotation.Fancy;

@Fancy(name = "Kitty", tags = {"animal", "cat"})
public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("cat " + name + " is running");

    }
}
