package OOP.Interfaces.ExtendingInterfaces;

public interface A {

    // static interface methods should always have a body.
//    static void greet(); not allowed, body is required.

    static void greet(){
        System.out.println("hello ji hello");
    }
    void fun();

}
