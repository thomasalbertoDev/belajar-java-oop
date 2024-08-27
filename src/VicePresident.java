
class VicePresident extends Manager {

    // Super constructor (fungsi nya adalah untuk memanggil constructor yang ada di class parent nya, untuk nama constructor di child class nya bebas menggunakan nama apa saja)
    VicePresident(String name) {
        super(name);
    }

    @Override
    public void sayHello(String name) {
        // this.name fungsi nya mengkases properti name yang ada di class Person bukan parameter name dari fungsi sayHello
        System.out.println("Hello " + name + ", My name is " + this.name + " and I am VP");
    }
}
