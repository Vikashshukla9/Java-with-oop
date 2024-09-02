package com.vikash;

import java.util.Scanner;

public class PQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any character: ");
        char ch = input.next().charAt(0); //it will read the first char in any string.
        int ascii = (int) (ch);
        System.out.println("ASCII value of " +ch +" is " +ascii);
    }
}
