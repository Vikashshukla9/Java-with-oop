package com.Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean ans = EvenOdd(a);
        System.out.println(ans);


    }
    static boolean EvenOdd(int a){
        if (a % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
