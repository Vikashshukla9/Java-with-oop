package OOP.Properties.Inheritance;

// this class wants all the properties that are in Box class. how we can do that, let's see...

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

//    BoxWeight(BoxWeight other){
//        super(other);
//
//    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight= weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor.
        // use to initialise the values present in the parent class.

        System.out.println(this.w);
        System.out.println(super.l);
        // it will not give the error
        // but in case suppose superclass also has the weight variable then if you want to access that variable you just use super in place of this.
        // this is the second use case of super keyword.
        System.out.println(super.weight);
        this.weight = weight;

//       // super(l, h, w); it will give error because it should be initialized first.
    }
}
