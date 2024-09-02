package com.ConditionalsAndLoops;

public class DoWhileLoop {
    public static void main(String[] args) {

        /*
        syntax:

         do {
                 #body
                 increment/decrement
           } while(condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n += 1;
        }
        while(n<=5);
    }
}
