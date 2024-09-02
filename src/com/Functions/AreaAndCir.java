package com.Functions;

import java.util.Scanner;

public class AreaAndCir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        areaCir(r);
    }
    static  void areaCir(int r){
        double cir =  2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("circumference = " +cir);
        System.out.println("area = " +area);
    }
}
