package OOP;

public class Singleton2 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();


        // all three reference var. are pointing to the only one object.

    }
}
