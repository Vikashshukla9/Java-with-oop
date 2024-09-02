package com.vikash;

import java.util.Scanner;

public class Any {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number: ");
        int a = input.nextInt();
        int count = 1;
        while (count != 11){
            System.out.println(a*count);
            count++;
        }
    }
}
