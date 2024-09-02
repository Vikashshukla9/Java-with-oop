package OOP.AbstractDemo;

public  class Son extends Parent{

    public Son(int age){
        super(age);

    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I'm going to be engineer");
    }

    @Override
    void partner() {
        System.out.println("i love someone");

    }
}
