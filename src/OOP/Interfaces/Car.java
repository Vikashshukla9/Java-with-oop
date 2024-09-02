package OOP.Interfaces;

public class Car  implements Engine, Brake, Media{

    @Override
    public void start(){
        System.out.println("i start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("i acclerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("i break like a normal car");

    }



}
