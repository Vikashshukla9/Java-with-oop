package OOP.AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("i'm going to be coder");
    }

    @Override
    void partner() {
        System.out.println("i love cute babies");
    }
}
