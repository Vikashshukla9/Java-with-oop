package com.ConditionalsAndLoops;

public class IfCondition {
    public static void main(String[] args) {

        /*
        syntax of if statement:

        if(boolean expression T or f){
              #body
              }
         else{
               #do this
              }

         */

        int salary = 20000;

        //single if-else statement.

//        if(salary > 10000) {
//            salary = salary + 2000;
//        }
//        else {
//            salary = salary + 1000;
//            }
//        System.out.println(salary);

        //multiple if-else statement.

        if(salary>10000){
            salary += 2000;
        } else if (salary>15000) {
            salary += 1500;

        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
    }


}
