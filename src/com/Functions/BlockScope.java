package com.Functions;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Vikash";
        {

//            int a = 100;   already initialized inside the same method, hence you can not initialize again.
               a = 100; // but you can change the value definitely.
            name = "Vikash shukla";
            System.out.println(name);

            int c = 20;
            // values initialised in this block will remain in this block.

        }
        System.out.println(name);
//        System.out.println(c); can not be used outside the block.
    }
}
