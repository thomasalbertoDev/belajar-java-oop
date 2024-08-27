
class Person {

    String name;
    String address;
    final String county = "Indonesia"; // Data tidak bisa diubah lagi tapi bisa diakses

    // Constructor dalam Java merupakan method yang pertama kali dijalankan saat sebuah object dibuat
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Overloading Constructor (Merupakan kemampuan membuat method yang sama namun dengan parameter yang berbeda)
    Person(String paramName){
        // Memanggil constructor yang ada diatas
       this(paramName, null);
    }

    Person(){
        this(null);
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
};
