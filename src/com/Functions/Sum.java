package com.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();   // function calling.

    }

    // function = Block of code that can be executed when it is called.
    /*
    Syntax:

    Access-modifier return type function name(arguments){
                             // code
                             return statement;
                             }
     */
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two number is " +sum);
    }
}
