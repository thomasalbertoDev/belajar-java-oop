package belajarjava.data;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Avanza is driving");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
