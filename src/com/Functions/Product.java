package com.Functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Product(a,b);


    }
    static void Product(int a, int b){
        int product = a * b;
        System.out.println("product = " +product);
    }
}
