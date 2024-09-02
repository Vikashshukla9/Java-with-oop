package com.vikash;

import java.util.Scanner;

public class inputprimitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking int as input

//        System.out.print("please enter your roll number:");
//        int rollNumber = input.nextInt();
//        System.out.println("your roll no is " +rollNumber);

        //taking string as input

//        System.out.print("Enter your name: ");
//       String a = input.nextLine();
//        System.out.println("hello " +a + "!");

        // Taking float as input

        System.out.print("Enter your marks: ");
        float marks = input.nextFloat();
        System.out.println("your marks is " +marks);
    }
}
