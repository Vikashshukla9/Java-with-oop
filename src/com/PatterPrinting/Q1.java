package com.PatterPrinting;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();
        int i,j;
        for (i = 1; i <= row ; i++) {
            for (j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            // after every row , we need to print new line.
            System.out.println();

        }


        }
    }
