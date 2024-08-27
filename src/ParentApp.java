public class ParentApp {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.name = "Tia";
        child.doIt();
        System.out.println(child.name);

        Parent parent = new Parent();
        parent.doIt();
        System.out.println(parent.name);

    }
}
