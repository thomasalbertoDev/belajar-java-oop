package belajarjava.application;

import belajarjava.data.HelloWorld;

public class HelloWorldApp {

    public static void main(String[] args) {
        // Anonymous class merupakan kemampuan membuat class sekaligus object secara langsung
        HelloWorld english = new HelloWorld() {

<<<<<<<<<<<<<<  ✨ Codeium Command ⭐  >>>>>>>>>>>>>>>>
            /**
             * Menampilkan pesan "Hello" tanpa nama.
             */
<<<<<<<  54191491-c7fc-4ac0-a28b-bbb70b7edaf8  >>>>>>>            public void sayHello() {
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
