
class Manager {

    String name;

    Manager(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        // this.name fungsi nya mengkases properti name yang ada di class Person bukan parameter name dari fungsi sayHello
        System.out.println("Hello " + name + ", My name is " + this.name + " and I am Manager");
    }
}
