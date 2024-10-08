package OOP.Interfaces;

public class NiceCar {

    private Engine engine;
    private Media player = new Cdplayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

   public void start(){
        engine.start();
   }
    public void stop(){
        engine.stop();
    }
    public void StartMusic(){
        player.start();
    }

    public void StopMusic(){
        player.stop();
    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
