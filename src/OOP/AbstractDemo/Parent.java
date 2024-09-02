package OOP.AbstractDemo;

public abstract class Parent {      // since if a class contains one or more abstract method that should also be declared as abstract.

    // you can have any variable over here as well...

    int age;

    public Parent(int age) {
        this.age = age;
    }

    //you can not create the abstract constructor.
//    abstract Parent();

    //static method in abstract class.

    static  void nothing(){
        System.out.println("i'm in static method");
    }

    //normal method

    void normal(){
        System.out.println("i'm in normal method");
    }

    // abstract method
    abstract void career();
    abstract void partner( );
}
