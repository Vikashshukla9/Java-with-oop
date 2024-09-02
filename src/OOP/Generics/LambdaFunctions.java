package OOP.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i + 1);
        }
//       arr.forEach(item -> System.out.println(item * 2));  // lambda function
//it will also do the same work as above.

        Consumer<Integer> fun = item -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;


    }

    int sum(int a, int b){
        return a + b;
    }
}
// if you want to work wit multiple parameters then you can create the interface of it

interface Operation{
    int operation(int a, int b);

}