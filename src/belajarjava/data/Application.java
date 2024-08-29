package belajarjava.data;

public class Application {

    public static final int PROCESSORS;

    // Static block
    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
