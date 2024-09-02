package com.JavaExercise;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ques: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        System.out.println("Enter the principle: ");
        int p = in.nextInt();
        System.out.println("enter the rate: ");
        int r = in.nextInt();
        System.out.println("enter the time: ");
        int t = in.nextInt();
        int si = (p * r * t)/100;
        System.out.println("simple interest is " +si);
    }
}
