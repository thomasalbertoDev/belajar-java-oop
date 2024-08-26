public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        var person1 = new Person("Constructor Overloading 1" , "Jl.Surya Suci");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.county);
        person1.sayHello("Budi");

        var person2 = new Person("Constructor Overloading 2");
        System.out.println(person2.name);
        person2.sayHello("Budi");

        var person3 = new Person();
        person3.name = "Constructor Overloading 3"; 
        System.out.println(person3.name);
        person3.sayHello("Budi");
    }
}
