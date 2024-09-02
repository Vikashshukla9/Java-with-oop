package com.Functions;

public class MethodScope {
    public static void main(String[] args) {

        /*
        scoping simply means that one var defined in one function can not be used in another function.
         */
        int a = 10;
        int b = 20;
        System.out.println(a);
//        System.out.println(num1); this will give me an error because this var is defined in som another function scope.
    }
    static void num(){
        int num1 = 100;

        System.out.println(num1);
//        System.out.println(a); it will also show me an error because of this var is not defined in this function scope hence can't be used.
    }
}
