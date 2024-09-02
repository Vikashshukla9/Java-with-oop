package com.Functions;

public class ParametersAndArguments {
    public static void main(String[] args) {
        int ans = sum(10, 20);         // arguments(actual)
        System.out.println("sum = " +ans);

    }
    static int sum(int a, int b){     //parameters (formal)
        int sum = a + b;
        return sum;
    }
}
