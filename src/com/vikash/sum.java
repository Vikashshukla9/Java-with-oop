package com.vikash;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two number is " +sum);

        // if you add any floating point no. then it will produce an error.
        //if you change the input type to float and give input as integer then it'll not produce an error it will covert the integer no. into float no and produce the output which is the topic known as type conversion and casting.

    }
}
