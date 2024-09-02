package com.vikash;

import java.util.Scanner;

public class Pq1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.
        System.out.print("enter the first number: ");
        int a = input.nextInt();
        System.out.print("enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println("sum is " +sum);
        System.out.println("product is " +product);



    }
}
