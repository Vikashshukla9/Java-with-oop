package OOP.Interfaces;

public class Cdplayer  implements Media{
    @Override
    public void start() {
        System.out.println("rock music");
    }

    @Override
    public void stop() {
        System.out.println("music stop");

    }
}
