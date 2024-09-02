package com.JavaExercise;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ques: Take 2 numbers as inputs and find their HCF or GCD and LCM.
        System.out.println("Enter the first number:" );
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        int temp = 0;
        int i = 1;
        for (i=1; i<= a; i++){
            if (a % i == 0 && b % i == 0)
                temp = i;
        }
        System.out.println(temp);
        int lcm = (a*b)/temp;
       System.out.println(lcm);
    }
}
