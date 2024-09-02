package com.Functions;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();
        int ans1 = Largest(a,b,c);
        System.out.println("Largest number = " +ans1);
        int ans2 = Smallest(a,b,c);
        System.out.println("Smallest number = " +ans2);

    }
    static int Largest(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;

    }

    static int Smallest(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        return min;
    }
}
