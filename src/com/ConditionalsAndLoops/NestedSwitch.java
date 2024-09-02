package com.ConditionalsAndLoops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the roll no.: ");
        int rn = in.nextInt();
        System.out.println("enter the department");
        String str = in.next();

        switch (rn){
            case 1:
                System.out.println("Vikash shukla");
                break;
            case 2:
                System.out.println("Abhay shukla");
                break;
            case 3:
                System.out.println("roll no is 3");
                switch (str){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("no department entered: ");
                    }
                    break;
            default:
                System.out.println("enter the correct roll no: ");
                }

        }
    }

