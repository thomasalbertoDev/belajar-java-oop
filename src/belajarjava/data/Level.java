package belajarjava.data;

public enum Level {
    STANDARD("Standar"),
    PREMIUM("Premium"),
    VIP("Vip");

    // Members enum (Field, Method, Constructor)
    // Field
    private final String description;

    // Constructors
    Level(String description) {
        this.description = description;
    }

    // Methods
    public String getDescription() {
        return description;
    }

}
