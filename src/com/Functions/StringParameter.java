package com.Functions;

import java.util.Scanner;

public class StringParameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String naam = in.nextLine();
        String ans = MyGreet(naam);
        System.out.println(ans);

    }
    static String MyGreet(String name){
        String msg = "hello " +name;
        return msg;
    }
}
