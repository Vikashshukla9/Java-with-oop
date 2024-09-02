package OOP.StaticExample;

public class Human {
    public static void main(String[] args) {
        main vikash = new main(22, "vikash shukla", 10000, false);
        main rahul = new main(24, "rahul singh", 200000, true);
        main arpit = new main(12, "arpit", 90000, false);


        System.out.println(vikash.name);
        System.out.println(main.population);   // by convention main will be used. vikash.population is not the conventon though it will work.
        System.out.println(main.population);
        System.out.println(main.population);

//        static void fun(){}  // this is not dependent on object.
//        greeting();    can not use the non-static thing in static thing.


        }
//    static void fun(){not dependent on object

    // greeting(); // can not use non static in static
//
    // define the reference object to use non static in static
//        main obj = new main();
//        obj.greeting();
//
//    }
//
//   Void greeting() {         // this method is dependent on object
//        System.out.println("hello");
//  }

}