package OOP.Properties.Polymorphism;

//public class objectPrint extends ObjectClass: by default every class is inherited from the object class.

public class objectPrint {

    int num;

    public objectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
       objectPrint object = new objectPrint(34);
        System.out.println(object); // it will print some things. every class is inherited from object class.
    }
}
