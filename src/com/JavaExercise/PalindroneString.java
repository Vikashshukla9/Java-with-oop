package com.JavaExercise;

import java.util.Scanner;

public class PalindroneString {
    public static void main(String[] args) {

        // Ques: To find out whether the given String is Palindrome or not.
/*
A string is called a palindrome string if the reverse of that string is the same as the original string.
For example, radar, level, etc.

 */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String a = in.next();
        int i = 0;
        int j = a.length() - 1;
        while(i < j){
            if(a.charAt(i) != a.charAt(j)){
                System.out.println("Not palindrome");
                System.exit(0);

            }
            i++;
            j--;
        }
        System.out.println("palindrome");

    }
}
