package com.Functions;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(3);
//        fun(4,"vikash");
       int ans =  sum(3, 5);
        System.out.println(ans);

    }
    static void fun(int a){
//        System.out.println(a);
//        System.out.println("first one");
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a +b +c;
    }

    static void fun(int a, String b){
        System.out.println("second one");
    }
}
