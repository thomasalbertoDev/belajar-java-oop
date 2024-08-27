public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Thomas";
        manager.sayHello("Tia");

        var vicePresident = new VicePresident();
        vicePresident.name = "Tia";
        vicePresident.sayHello("Adit");
    }
}
