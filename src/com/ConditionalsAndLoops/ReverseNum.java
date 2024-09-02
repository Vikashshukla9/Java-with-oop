package com.ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        long n = in.nextLong();
        long ans = 0;
        while(n > 0){
            long rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
