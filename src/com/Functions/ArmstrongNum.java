package com.Functions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        // printing all the three digit armstrong number.
        Scanner in = new Scanner(System.in);
        // to check armstrong or not.

//        System.out.print("enter the number: ");
//        int n = in.nextInt();
//        boolean ans = isarmstrong(n);
//        System.out.println(ans);

        // to print all the three digit armstrong number
        for (int i = 100; i < 1000 ; i++) {
            if (isarmstrong(i)){
                System.out.print(i + " ");
            }

        }
    }
    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        if (sum == original){
            return true;
        }
        return false;

    }
}
