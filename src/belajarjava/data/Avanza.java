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

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return true;
    }

    // Optional menggunaakn default method
    @Override
    public boolean isBig() {
        return true;
    }
}
