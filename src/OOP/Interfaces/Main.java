package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {

       // Engine car  = new Car();
//        Car car  = new Car();
//        car.start();
//        car.stop();
//        car.acc();
//        car.brake();
//
//        // it will print the same thing as engine that is why we use the saprate classs.
//        Media carmedia = new Car();
//        carmedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.StartMusic();
        car.UpgradeEngine();
        car.start();
    }
}
