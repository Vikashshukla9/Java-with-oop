package com.ConditionalsAndLoops;

import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = input.next().trim().charAt(0); // trim() removes the extra spaces.

        if (ch >= 'a' && ch <= 'z') {                // comparing with ascii values(type promotion)
            System.out.println(ch +" is lowercase");
        }else {
            System.out.println(ch +" is uppercase");
        }

    }
}
