package com.PatterPrinting;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of lines: ");
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
