package OOP.Properties.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("i'm in shapes");
    }

    //can we override a static method?
//    @Override      static methods will not be overridden.
    static void greeting(){
        System.out.println("hey");
    }
}
