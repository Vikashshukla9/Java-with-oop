package OOP.Properties.Inheritance;

public class BoxPrice extends BoxWeight {
    double coast;

    BoxPrice(){
        super();
        this.coast = -1;

    }

//    BoxPrice(BoxPrice old){
//        super(old);
//        this.coast = old.coast;
//    }

    public BoxPrice(double l, double h, double w, double weight, double coast) {
        super(l, h, w, weight);
        this.coast = coast;
    }

    public BoxPrice(double side, double weight, double coast) {
        super(side, weight);
        this.coast = coast;
    }
}
