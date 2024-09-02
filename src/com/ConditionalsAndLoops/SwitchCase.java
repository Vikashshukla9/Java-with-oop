package com.ConditionalsAndLoops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("enter the fruit name: ");
//        String fruit = in.next();
          // one way doing the this type of task can be if-else statements.
//        if (fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("sweet red fruit");
//        }

        // another effective method can be using switch statement.


//        switch (fruit){
//            case "Mango":
//                System.out.println("kind of fruits");
//                break;
//                // if break is not provided all the instruction below that will execute.
//            case "Apple":
//                System.out.println("sweet fruit");
//                 break;
//            case "Banana":
//                System.out.println("healthy fruit");
//                 break;
//            default:
//                System.out.println("enter any other fruit: ");
//        }

        // This switch statement can be written as :

//        switch (fruit){
//            case "Mango" -> System.out.println("kind of fruits");
//            case "Apple" -> System.out.println("sweet fruit");
//            case "Banana" -> System.out.println("healthy fruit");
//            default -> System.out.println("enter any other fruit: ");
//        }
        System.out.println("enter the number b/w 1 to 7: ");
        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("enter the valid number: ");
//        }


        // supppose we only to print the weekends or weekdays.
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekends");
//                break;
//            default:
//                System.out.println("enter the valid number: ");
//        }
        //enhanced switch statement:
        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("enter the valid number: ");
        }
    }
}
