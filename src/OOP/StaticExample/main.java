package OOP.StaticExample;

public class main {
    int age;
    String name;
    int sallary;
    boolean married;
    static long population;
    static void fun(){
        System.out.println("hello ji");
//        System.out.println(this.age);   can not use the this keyword inside static.
    }

    public main(int age, String name, int sallary, boolean married ){
        this.age = age;
        this.name = name;
        this.sallary = sallary;
        this.married = married;
        main.population += 1;     // class-name.population is there because when java will check for vikash.population
                                    /* it will be like does there exist population variable in vikash
                                     then it will be like no,
                                    then it will go to main class then it will be like
                                     does this exist here then yes, it is static variable
                                     increase the value by 1. same for others.
                                     */




    }
}
