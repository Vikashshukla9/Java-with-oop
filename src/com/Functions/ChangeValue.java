package com.Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // creating an array.
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]= 99;     // changing the value of reference var.
    }
}
