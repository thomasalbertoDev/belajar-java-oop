
class Person {

    String name;
    String address;
    final String county = "Indonesia"; // Data tidak bisa diubah lagi tapi bisa diakses

    // Constructor dalam Java merupakan method yang pertama kali dijalankan saat sebuah object dibuat
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    public void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
};
