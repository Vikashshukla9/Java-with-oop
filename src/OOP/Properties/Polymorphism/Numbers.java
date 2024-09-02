package OOP.Properties.Polymorphism;

public class Numbers {

    double sum(double a, int b){
        return a + b;
    }

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        /*
        here the type for a is required is double but you're passing an integer
        so java compiler checks it and found the sum() methode with two arguments so java compiler
        converts the int into double but if you enter the value of b as double and in methode
        it is integer so automatically typecasting will not not occure and it will give us an error.
        but here int one sum is there so it will take that.
        */
        obj.sum(1,2,3);
//        obj.sum(1,2,3,4); this is giving me an error because there is no functions in Number class that takes four arguments.

    }
}
