package com.ConditionalsAndLoops;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        syntax of a while loop:

        while(condition){
                 #loop
                 increment/decrement;
                 }

            /*

            as comapred to for loop- the initialisation part come out of the while loop
            condition will come inside the while loop
            then body will come and then increment or decrement will come.
         */

        // print the number from 1 to 10 using while loop.

        int a = 1;
        while (a<=10){
            System.out.println(a);
            a += 1;
        }

        /*
        for loop vs while loop:
                                when you don't know how many times the loop is going to run
                                while loop is used and when you know it for loop is used.
         */
    }
}
