package com.ConditionalsAndLoops;

import java.util.Scanner;

public class UpdatedCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true){
            System.out.println("Enter the operation: ");
            char op = in.next().trim().charAt(0);

            System.out.println("Enter the two numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                if (op == '+') {
                    ans = a + b;
                    System.out.println("The sum of " + a + " and " + b + " is " + ans);
                }
                if (op == '-') {
                    ans = a - b;
                    System.out.println("The sum of " + a + " and " + b + " is " + ans);
                }
                if (op == '*') {
                    ans = a * b;
                    System.out.println("The sum of " + a + " and " + b + " is " + ans);
                }
                if (op == '/') {
                    ans = a / b;
                    System.out.println("The sum of " + a + " and " + b + " is " + ans);
                }
                if (op == '%') {
                    ans = a % b;
                    System.out.println("The sum of " + a + " and " + b + " is " + ans);
                }

            } else if (op =='x' || op == 'X') {
                break;

            }else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);

        }

    }
}
