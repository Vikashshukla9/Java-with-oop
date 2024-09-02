package com.Functions;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,6,7);
//        multiple(2,3,"vikash", "shukla");
        demo(5,7,8);
        demo("vikash");
        //demo();  error willl be showns because of no data provided.

    }

    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v){   // when you don't know how many variables has to be taken as input use varargs.
        System.out.println(Arrays.toString(v));

    }
}


//static void fun(int a, int ....v, int b){   // var. length arguments will be declared only in the end. because how one can know when b is coming because v can can contain any number of arguments.
//
//}