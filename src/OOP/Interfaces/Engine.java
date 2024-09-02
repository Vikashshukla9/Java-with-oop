package OOP.Interfaces;

public interface Engine {

    static final int price = 77000;   // variables are by default static and final in interfaces.

    // Functions are by default public and abstract in interfaces.

   public abstract void start();
    public abstract  void stop();
    public abstract  void acc();
}
