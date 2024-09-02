package com.ConditionalsAndLoops;

import java.util.Scanner;

public class LargestPQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        // Method -1: this code is also performing the required task.
//        if (a > b && a > c){
//            System.out.println(a +" is greatest number");
//        } else if (b > a && b > c) {
//            System.out.println(b +" is largest number");
//        } else {
//            System.out.println(c +" is largest number");
//        }

        // method 2:
//
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max +" is largest");

        // method 3:
        // math.max() gives the max value b/w two values.

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
