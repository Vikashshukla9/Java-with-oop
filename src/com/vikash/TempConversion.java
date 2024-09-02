package com.vikash;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in calcius: ");
        float c = input.nextFloat();
        float f = (c * 9/5 ) + 32;
        System.out.println("temperature in ferenhiet is " +f);

    }
}
