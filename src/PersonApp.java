public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        var person = new Person("Thomas Alberto" , "Jl.Surya Suci");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.county);

        person.sayHello("Budi");
    }
}
