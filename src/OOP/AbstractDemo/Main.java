package OOP.AbstractDemo;


public class Main {
    public static void main(String[] args) {

        Son son = new Son(20);
        son.career();
        son.partner();
        son.normal();  // normal method

        Daughter daughter = new Daughter(22);

       // even thought we can create the object of the parent class but we can make something like this
        //because what will be accesssed will be defined by reference ab how it will do the work will be defined
        //the obj reference.
//        Parent daughter = new Daughter(22);

        daughter.career();
        daughter.partner();

//        Parent mom = new Parent();  you can not create the object of the abstract class.

//        parent.nothing();
        Parent.nothing();

        }


    }


