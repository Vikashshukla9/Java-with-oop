package com.vikash;

import java.util.Scanner;

public class PQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ques: Take name, roll number and field of interest from user and print in the format below :
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
        System.out.print("Please enter your name: ");
        String a = input.nextLine();
        System.out.println("Please enter your roll number: ");
        long b = input.nextLong();
        System.out.println("Please enter you field of interest: ");
        input.next();
        String c = input.nextLine();
        System.out.println("Hey, my name is " +a +" and my roll number is " +b +"." +" My field of interest are " +c +".");



    }
}
