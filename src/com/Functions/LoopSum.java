package com.Functions;

import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sum(n);
        System.out.println("sum = " +ans);
    }
    static int sum(int  n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum = sum + i;

        }
        return sum;
    }
}
