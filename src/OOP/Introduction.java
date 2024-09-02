package OOP;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {

        /*
        Let say your teacher says to create a data type that store the roll number of five students....
        then we can do something like this-
         */

        int[] Roll_number = new int[5];

       /*
       Now let say your teacher says to store the names of five students.
       so we can create something like this:-
        */

        String[] names = new String[5];

       /*
       now let say your teacher says to create something which  can store the data of
       five students = {name, roll no. marks }. so we can create something like this:-
        */

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        /*
        Now your teacher says that it is ok but i want these all data to be stored in single
        data type like you have stored name and roll no. now you'll get confused that how can create something
        which can store int, float and string in only one data type. In this senerio classes come in the game.
       in this example, if you want to combine these three data types in a single entity
       you can do that via classes ans also if you want to create your own data type you can do that via classes.

         */

        Student[] students = new Student[5];

//        Student Vikash;   // Vikash(ref. var.) will have three properties that is roll no, name, and marks.

//        System.out.println(Arrays.toString(students));  // when student is not iniatialized by default the value is null.

        // how to menuplate the object:

        Student vikash = new Student();

        vikash.name = "Vikash shukla";
        vikash.rno = 119;
//        vikash.marks = 82.4f;
        System.out.println(vikash.name);
        System.out.println(vikash.rno);
        System.out.println(vikash.marks);
//        System.out.println(vikash.sallary); // it will give us error why because sallary doesn't exist in class template.


    }

    }
    // creating a class.
    //every single students has rno, name and marks.

    class Student{
        int rno;
        String name;
        float marks = 99;
}
