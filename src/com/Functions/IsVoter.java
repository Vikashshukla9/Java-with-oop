package com.Functions;

import java.util.Scanner;

public class IsVoter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean ans = voter(age);
        System.out.println(ans);
    }
    static boolean voter(int age){
        return age >= 18;
    }
}
