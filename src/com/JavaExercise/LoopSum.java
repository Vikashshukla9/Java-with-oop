package com.JavaExercise;

import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ques: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
       int num1 = 0;
       int sum = 0;
       int i = 1;
        System.out.print("press any latter to quit or ");
        System.out.print("enter num " +i +" =");

        while (in.hasNextInt()){    //.hasNextInt() will check whether the number is integer or not.
            num1 = in.nextInt();
            sum = sum + num1;
            i++;
            System.out.print("enter num " +i +" =");
        }
        System.out.println("sum of all the entered number is " +sum);
    }
}
