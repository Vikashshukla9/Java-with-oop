package com.JavaExercise;

import java.util.Scanner;

public class RupeesUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rupees: ");
        double inr = in.nextDouble();
        System.out.println("enter the current exchange rate between INR and USD: ");
        float x = in.nextInt();
        double usd = inr / x;
        System.out.println("usd " +"=" +usd);
    }
}
