package OOP.Interfaces.ExtendingInterfaces;

public class Main  implements B{

    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        Main obj =  new Main();
        A.greet();   // static methods are called viva class or interface name.
    }
}
