package com.Functions;

public class LoopScope {
    public static void main(String[] args) {
        int a = 10;   // a is initilized outside the loop can be used or updated inside the loop.
        for (int i = 0; i < a ; i++) {
            int num = 10;   // num can only be used inside the for loop.
            a = 100;


        }
        System.out.println(a);   // will print the updated value.
//        System.out.println(num); will give me error because it can only be used inside loop scope.
    }
}
