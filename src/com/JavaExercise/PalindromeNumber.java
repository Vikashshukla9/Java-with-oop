package com.JavaExercise;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ques: a number that is equal to the reverse of that same number is called a palindrome number. For example, 3553, 12321, etc.
        System.out.println("Enter the number to be checked: ");
        int n = in.nextInt();
        int temp = n;
        int rem;
        int rev = 0;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }
}
