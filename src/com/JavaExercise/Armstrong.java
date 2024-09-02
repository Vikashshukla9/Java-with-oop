package com.JavaExercise;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        // Ques: To find Armstrong Number between two given number.

        /*
        a number is armstrong number if:
        abcd..... = a^n + b^n + c^n + d^n......
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = input.nextInt();
        int t1 = n;
        int len = 0;
        // loop that calculates the length of given number.
        while(t1 != 0){
            len = len + 1;
            t1 = t1 / 10;
        }
        int t2 = n;
        int rem;
        int arm = 0;
        while (t2 != 0){
            int mul = 1;
            rem = t2 % 10;
            for (int i = 1; i<= len; i++){
                mul = mul * rem;
            }
             arm = arm + mul;
            t2 = t2 / 10;

        }
        if(arm == n){
            System.out.println("armstrong");
        }else {
            System.out.println("not armstrong");
        }

    }
}
