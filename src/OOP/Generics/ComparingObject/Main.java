package OOP.Generics.ComparingObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Student vikash = new Student(19, 82.7f);
        Student kunal = new Student(12, 87.6f);
        Student raman = new Student(2, 85.6f);
        Student akshay = new Student(13, 77.6f);
        Student tushar = new Student(4, 86.6f);

        Student[] list = {vikash, kunal, raman, akshay, tushar};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



//        //comparing objects.
//        if (vikash.compareTo(kunal) < 0){
//            System.out.println(vikash.compareTo(kunal));
//            System.out.println("kunal has more marks");
//        }

    }
}
