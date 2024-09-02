package com.Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
//        boolean ans = isprime(n);   // we can get the o/p in this way as well.
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;

    }
}
