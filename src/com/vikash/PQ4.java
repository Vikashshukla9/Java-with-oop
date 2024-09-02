package com.vikash;

import java.util.Scanner;

public class PQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ques: ake side of a square from user and print area and perimeter of it.
        System.out.println("Enter the side of square: ");
        int a = input.nextInt();
        System.out.println("perimeter of square is "+ 4*a +" and area of square is " +a*a +".");

    }
}
