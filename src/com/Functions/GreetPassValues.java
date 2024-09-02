package com.Functions;

public class GreetPassValues {
    public static void main(String[] args) {
        String name = "vikash shukla";
        greet(name);

    }
    static void greet(String naam){
        System.out.println(naam);


    }
}

/*
what is happening over here is ....when greet() is called vikash shukla that is passed in name will be replaced by
naam.in java there is nothing called as pass by reference there is only pass by value. so the value of the name
variable is passed.
 */