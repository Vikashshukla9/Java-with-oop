package OOP;

public class Singleton {
    private Singleton(){    // private means it will be accesible in this file only.


    }
    private static Singleton instance;

    public static Singleton getInstance() {

        // check wheather one instance only is created or not.

        if (instance == null){
            instance = new Singleton();

        }
return instance;
    }
}
