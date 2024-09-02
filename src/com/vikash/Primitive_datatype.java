package com.vikash;

import java.sql.SQLOutput;

public class Primitive_datatype {
    public static void main(String[] args) {
        //primitive data type are the datatype that can be break further.
        int roll_no = 22; // 4 bytes
        char letter = 'v';
        float marks = 99.9f; // four bytes
        double largeDecimalNumber = 99888822.222; // 8 bytes
        long largeInteger = 220687837792718L; // 8 bytes
        boolean check = true; // or false

        Integer rno = 22; // rapper class of primitives.
        int million = 232_000_00; // underscore will be ignored.
        System.out.println(million);

    }
}
