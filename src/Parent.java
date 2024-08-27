 class Parent {
    String name;
    void doIt(){
        System.out.println("Do It in parent");
    }    
}

class Child extends Parent {
    String name;

    void doIt(){
        System.out.println("Do It in child");
    }
}
