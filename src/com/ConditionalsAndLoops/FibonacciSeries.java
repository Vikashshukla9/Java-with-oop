package com.ConditionalsAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the terms of fibonacci series: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        int  i = 2;
        while( i <= n ){
            int temp = b;
            System.out.println(""+temp);
            b = a + b;
            a = temp;
            i++;
        }

    }
}
