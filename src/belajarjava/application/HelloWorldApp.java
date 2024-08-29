package belajarjava.application;

import belajarjava.data.HelloWorld;

public class HelloWorldApp {

    public static void main(String[] args) {
        // Anonymous class merupakan kemampuan membuat class sekaligus object secara langsung
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Budi");
    }
}
