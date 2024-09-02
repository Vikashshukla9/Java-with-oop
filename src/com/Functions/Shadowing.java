package com.Functions;

public class Shadowing {
    static int x = 100;  //this will be shadowed at line 8.

    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x;           // the class var. at line 4 will be shadowed by this
//        System.out.println(x);// scope will begin when the value is initialized
          x= 40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
