package com.ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take the input from the user till the user enters X or x.
        int ans = 0;

        while(true){
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input the two number
                System.out.println("enter two number: ");
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println();

                if (op == '+') {

                    ans = a + b;
                }
                if (op =='-'){
                    ans = a - b;

                }
                if (op == '*'){
                    ans = a * b;
                }
                if (op == '/'){
                    if(b != 0){
                        ans = a / b;
                    }
                }
                if (op == '%'){
                    ans = a % b;
                }
            } else if (op == 'x' || op == 'X') {
                break;

            }
            else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
