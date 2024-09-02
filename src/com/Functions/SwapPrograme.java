package com.Functions;

import java.util.Scanner;

public class SwapPrograme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = in.nextInt();
        System.out.println("enter the second number: ");
        int b = in.nextInt();
        swap(a,b);


    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

}
/*

in swap function the copy of the values a and b are passed and swapping logic is applied on those values
if you want to have the swapped value then print it in swap function only because outside
 the swap function values of a and will be original.  means that in swap() copied values of a and b are passed
 and operations are performed on copied values.
 */