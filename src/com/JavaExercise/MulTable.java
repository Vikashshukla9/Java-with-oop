package com.JavaExercise;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ques: Take a number as input and print the multiplication table for it.
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int i = 1;
        System.out.println("multiplication table for " +n +" is: ");
        while (i <= 10){
            System.out.println(i * n);
            i++;
        }
    }
}
