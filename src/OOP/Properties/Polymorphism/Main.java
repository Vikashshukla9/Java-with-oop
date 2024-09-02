package OOP.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {

        // creating the objects.

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();  // since the object type is of sqaure so it will print the are of sqaure dude to method overriding.
       //reference type = new object type();
       shape.area();
       circle.area();
       square1.area();
       square1.greeting();    // since the method is not not overridden it will print the ref type method.


    }
}
