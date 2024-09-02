package OOP.Enums;

public class Basic{

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants.
        // every single one here is public, static and final one.
        // since these are final you can't create child enums.
        // type of all of these is Week.
        @Override
        public void hello() {
            System.out.println("hello ji");
        }


        Week() {
            System.out.println("constructor called for " +this);
        }

        // this constructor is not public or protected only private or default.
        // because we don't want to create new objects
        // because this is not the enum concept
        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week);
//        System.out.println(week.ordinal());


    }
}
