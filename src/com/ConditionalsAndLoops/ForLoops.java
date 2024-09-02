package com.ConditionalsAndLoops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        /*
        syntax of for loops:

        for(initialisation; condition; increment/decrement){
                          #body
                                 }
         */

        // for eg print the number from 1 to 10.

//        int a = 1;
//        for (a = 1; a <= 10; a++){
//            System.out.println(a);
//        }


        // print the number from 1 to n.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int a = 1;
        for (a=1; a<=n; a++){
            System.out.println(a);
        }
    }
}
