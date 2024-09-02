package OOP.StaticExample;

// this is  to show hwo to initialize the static variables.
public class StaticBlock {

    static int a = 6;
    static int b;


    // only runs once, when the first object is created i.e class is loaded for the first time.
    static {
        System.out.println("i'm in static block");
          b = a * 7;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" " +StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a +" " +StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" " +StaticBlock.b);
    }

}
