public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Thomas");
        manager.sayHello("Tia");

        var vicePresident = new VicePresident("Tia");
        vicePresident.sayHello("Adit");
    }
}
