package OOP.Properties.Inheritance;

public class Box {
//    private double l; // if it will be private then the inherited class will not be to use it.
    double l;
    double h;
    double w;
    double weight;

    Box(){
//        super(); // object class, which inherit all the classes.
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("i'm in box");
    }
}
