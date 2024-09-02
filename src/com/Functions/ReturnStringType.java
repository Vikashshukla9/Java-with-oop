package com.Functions;

public class ReturnStringType {
    public static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);

    }
    static String greet(){
         String greeting = "Hey!";
         return greeting;
    }
}

/*
how it is working :

first the main method will run and from there that will jump to greet() and reads the strings and return type
and then that will be stored in msg variable and will be printed.
 */