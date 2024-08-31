package belajarjava.application;

import belajarjava.error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        connectionDatabase(null, null);
    }

    public static void connectionDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa terhubung ke database, username dan password tidak boleh null");
        }
    }
}
