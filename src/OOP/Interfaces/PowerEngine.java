package OOP.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
        System.out.println("power enginer stop");
    }

    @Override
    public void acc() {
        System.out.println("power engine acc");

    }
}
