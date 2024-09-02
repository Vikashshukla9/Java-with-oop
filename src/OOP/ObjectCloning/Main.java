package OOP.ObjectCloning;

import java.util.Arrays;

public class Main   {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vikash = new Human(20,"shukla ");
//        Human twin = new Human(vikash);   // it simpaly making the copy of vikash.

        // because we have used new keyword it takes more time, instead we can use clone() method.

        Human twin = (Human) vikash.clone();   // object cloning
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));

        //shallow copy
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(vikash.arr));

    }
}
