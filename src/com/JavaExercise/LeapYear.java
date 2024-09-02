package com.JavaExercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ques: Input a year and find whether it is a leap year or not.
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 !=0 || year % 100 ==0 && year % 400 == 0){
            System.out.println("Entered year is leap year");
        }
        else {
            System.out.println("Entered year is not leap year");
        }
    }
}
