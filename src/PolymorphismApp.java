
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
      if(employee instanceof VicePresident){
        // Casts (Casts merupakan proses merubah tipe data bukan primitf)
        // Pada contoh ini, employee menjadi VicePresident
        VicePresident vicePresident = (VicePresident) employee;
        System.out.println("Hello, My name is " + vicePresident.name + " and I am VP");
      } else if(employee instanceof Manager){
        // Casts (Casts merupakan proses merubah tipe data bukan primitf)
        // Pada contoh ini, employee menjadi Manager
        Manager manager = (Manager) employee;
        System.out.println("Hello, My name is " + manager.name + " and I am Manager");
      } else {
        System.out.println("Hello, My name is " + employee.name + " and I am Employee");
      }
    }
}
