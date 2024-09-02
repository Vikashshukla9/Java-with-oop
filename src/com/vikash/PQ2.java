package com.vikash;

import java.util.Scanner;

public class PQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ques:Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.print("Enter the length in double data type: ");
        double len = input.nextDouble();
        System.out.println("enter the breadth in double data type: ");
        double breadth = input.nextDouble();
        double area = (int) (len * breadth);
        System.out.println("Area of rectengle is " +area);


    }
}
