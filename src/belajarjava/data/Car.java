package belajarjava.data;

public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTire();

    // Default method merupakan method yang tidak perlu diimplementasikan di class turunannya jika ingin menggunakan method ini tinggal gunakan saja
    default boolean isBig() {
        return false;
    }
}
