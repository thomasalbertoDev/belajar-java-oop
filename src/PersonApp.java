public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        var person = new Person();
        person.name = "Thomas Alberto";
        person.address = "Jl.Surya Suci";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.county);
    }
}
