package OOP.AccessControl;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10,"vikash");
        // i want to do few things
        //1. access the data members
        //2. modify the data members

        obj.setNum(23);  // setting the number
        System.out.println(obj.getNum());  // getting the num .

        String a =obj.name;
    }
}
