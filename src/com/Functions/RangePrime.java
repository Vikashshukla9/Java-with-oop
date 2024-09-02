package com.Functions;

import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lower = in.nextInt();
        int upper = in.nextInt();
        for (int i = lower; i <= upper ; i++) {
                      if (Isprime(i)){
                          System.out.println(i);
                      }
        }
    }
    static boolean Isprime(int n ){
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
