public class Manager {
    String name;

    public void sayHello(String name){
        // this.name fungsi nya mengkases properti name yang ada di class Person bukan parameter name dari fungsi sayHello
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
