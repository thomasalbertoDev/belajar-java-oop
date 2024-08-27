
public class PolymorphismApp {

    public static void main(String[] args) {
        // Polymorphism merupakan kemampuan sebuah object berubah bentuk menjadi bentuk lain

        Employee employee = new Employee("Thomas");
        employee.sayHello("Tia");

        employee = new Manager("Adit");
        employee.sayHello("Dinda");

        employee = new VicePresident("Agung");
        employee.sayHello("Jono");

        // Pemanggilan Method Polymorphism
        sayHello(new Employee("Thomas"));
        sayHello(new Manager("Adit"));
        sayHello(new VicePresident("Agung"));

    }

    // Method Polymorphism 
    static void sayHello(Employee  employee) {
        System.out.println("Hello " + employee.name);
    }
}
