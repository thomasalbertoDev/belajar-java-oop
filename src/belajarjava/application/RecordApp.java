package belajarjava.application;

import belajarjava.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("eko", "eko123");

        System.out.println(loginRequest);
    }
}
