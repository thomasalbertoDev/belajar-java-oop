
class Person {

    String name;
    String address;
    final String county = "Indonesia"; // Data tidak bisa diubah lagi tapi bisa diakses

    public void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
};
