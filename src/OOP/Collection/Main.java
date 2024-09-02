package OOP.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// list extands collection as they have the common properties
        List<Integer> list = new ArrayList<>();    // list is of parent type and Arraylist is of type child .
        List<Integer> list2 = new LinkedList<>();

//        list2.add(23);
//        list2.add(56);
//        list2.add(67);
//        System.out.println(list2);


        // vector class: similiar to Arraylist but slower as it is synchronized.
        List<Integer> vector = new Vector<>();
        vector.add(34);
        vector.add(23);
        vector.add(32);
        System.out.println(vector);
    }
}
