package com.ConditionalsAndLoops;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = in.nextLong();
        System.out.println("Enter the digit to be checked: ");
        int a = in.nextInt();
        int i = 0;
        while(n > 0){
           long rem = n % 10;
           if(rem == a){
               i++;
           }
           n = n/10;

        }
        System.out.println("occurance of " +a +" is " +i+".");

    }
}
