package com.JavaExercise;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ques: Write a program to print whether a number is even or odd, also take input from the user.

        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Given number is even");
        }else {
            System.out.println("given no is odd");
        }
    }
}
