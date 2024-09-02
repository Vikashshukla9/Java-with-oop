package com.JavaExercise;

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ques: Take in two numbers and an operator (+, -, *, /) and calculate the value
        System.out.println("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        System.out.println("enter the first number: ");
        int a = in.nextInt();
        System.out.println("enter the second number: ");
        int b = in.nextInt();
        switch (op){
            case '+':
                System.out.println("sum " +" = " +a+b);
                break;
            case '-':
                System.out.println("difference " +"= " +(a-b));
                break;
            case '*':
                System.out.println("multiplication " +"= " +a*b);
                break;
            case'/':
                System.out.println("division " +"= " +a/b);
            default:
                System.out.println("enter valid operator: ");
        }
    }
}
