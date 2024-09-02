package com.Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        IsFactorial(n);
    }

    static void IsFactorial(int n) {
//        if (n == 1 || n == 0) {
//            int fact = 1;
//            System.out.println(fact);
//
//        } else {

        // without using the if else conditions we can print the factorial.
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;

            }
            System.out.println(fact);
        }


    }
//}
