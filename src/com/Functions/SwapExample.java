package com.Functions;

public class SwapExample {
    public static void main(String[] args) {

        // in this code values will not be swapped.
//
//        int a = 10;
//        int b = 20;
//      swap(a,b);
//        System.out.println(a +" " +b );
//
//
//    }
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;        //this change will only be valid in this function scope only.


        // in the below code the name will not be changed from vikash shukla to only vikash.

        String name = "vikash shukla";    
        changename(name);
        System.out.println(name);


    }
    static void changename(String name){
        name = "vikash ";        // here,not changing the object, but creating the new object.
    }                            // any change in the original object will be reflected in the o/p.
}
