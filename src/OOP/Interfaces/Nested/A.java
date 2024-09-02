package OOP.Interfaces.Nested;

public class A {

    public interface NestedInterfaces{
        boolean IsOdd(int num);
    }
}

class B implements A.NestedInterfaces{

    @Override
    public boolean IsOdd(int num) {
        return (num & 1) == 1;
    }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.IsOdd(3));
    }
}