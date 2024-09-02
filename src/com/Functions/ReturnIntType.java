package com.Functions;

import java.util.Scanner;

public class ReturnIntType {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

    }
    // return the value.
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
       // System.out.println("it will never run");
    }
}
