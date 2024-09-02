package com.PatterPrinting;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int row = in.nextInt();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");

            }
            System.out.println();
            
        }
    }
}
