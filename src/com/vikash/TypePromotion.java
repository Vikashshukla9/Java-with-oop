package com.vikash;

public class TypePromotion {
    public static void main(String[] args) {

        //since we're storing greater value than the maximum size of byte, so it will o/p the remainder.

//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 10;
//        int d = a * b/c;  // a*b is performed using int operation.
//        System.out.println(d);

//        byte a = 40;
//        a = a*2; // it will produce an error because can't store the evalutions in byte.

//        int number = 'A';
//        System.out.println(number); // it will print the ascii value of A.

        // java follows the unicode.
//        System.out.println("नमस्ते"); // hello in hindi
//        System.out.println("こんにちは"); // hello in japanese.

        //let's look on an example of type promotion.

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *b) + (i / c) - (d -s);
        System.out.println((f *b) + " " + (i / c) + " " +(d -s));
        System.out.println(result);

        // in f*b , b is promoted into float as float is bigger data type and all the expression is calculated in float.
        // in i/c, c is promoted to integer and the entire ans is integer.
        // in d-s , s is promoted to double.
        // float + int + double = double.
    }
}
