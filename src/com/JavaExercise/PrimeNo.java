package com.JavaExercise;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = in.nextInt();
        boolean prime = true;
         for (int i = 2; i < n; i++){
             if (n %i == 0){
                 prime = false;
             }
             }
        System.out.println(prime);

         }

    }

