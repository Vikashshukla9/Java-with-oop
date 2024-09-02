package com.vikash;

import java.util.Scanner;

public class PQ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping values are " +a +" and " +b +".");


    }
}
