package OOP;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//a. here we don't get so many functions

//        Integer num = 45;
//        num. (by using the ref var and dot we get so many functions because it is wrapper class and class has so many functions/


        // if you call the swap functions, it will not swap becuase java i s pass by value not by reference.
        // still it will not swap because Integer class is final class.



        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a +" " +b);

        // but when you pass objects the reference value is passed.


        // final keyword:  THE VAR WHICH IS GOING TO HAVE FINAL VALUE WILL ALWAYS BE CAPITAL.

       final int INCREASE = 2;
//       INCREASE = 4; // WILL GIVE ERROR BECAUSE YOU CAN'T CHANGE THE VALUE.

        final A vikash = new A("vikash");
        vikash.name = "shukla ji "; // you can change over her because it is not of int type.
        System.out.println(vikash.name);

        A obj;
        for (int i = 1; i <1000000 ; i++) {
              obj =  new A("random name");
        }
    }
    static  void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }
}

class A {
    String name;

    public  A(String name){
        this.name = name;
    }
// garbage collection: when any object of the class a is destroyed this will be called.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}


