package OOP.Properties.Polymorphism;

public class Circle extends Shapes {

    // this will run when the object of the circle is created.
    // hence it is overriding the parent method.
    @Override // this is called annotations.
    void area(){
        System.out.println("  area is pi * r * r");
    }
}
