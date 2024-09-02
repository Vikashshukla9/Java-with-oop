package OOP.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box();
//        System.out.println(box1.l +" " + box1.h +" " + box1.w);
//        /* in this code it will be like which constructor in the Box class takes no arguments
//        and it will run that constructor
//         */
//
//        Box box2 = new Box(4);
//        System.out.println(box2.l +" " + box2.h +" " + box2.w);
//        /* in this code it will be like which constructor in Box class takes only one argument
//        so it will run that constructor
//         */
//
//        Box box3 = new Box(3.4,4.5,6.7);
//        System.out.println(box3.l +" " + box3.h +" " + box3.w);
//        /* in this code it will be like which constructor is there that takes 3 arguments
//        so it will run that constructor
//         */
//
//        Box box4 = new Box(box1);
//        System.out.println(box4.l +" " + box4.h +" " + box4.w);
//        /* in this code it will be which constructor in the Box class takes the value of old box
//        and it will print that.
//         */

//        Box box5 = new Box();
//        System.out.println(box5.weight);
        // you can not access the members of the class that is inherited by it's parent class.
        /* in simple terms f you create the object of parent class directly then it will not be able to access
        the properties and behaviour of child class.
         */

//        Box box6 = new BoxWeight(1,2,3,4);
//        System.out.println(box6.weight);
//        // you can not access weight because Box class doesnt have access to weight

        // there are many variables in both parent and child classes.
        // your are given access to the variables that are in ref type i.e BoxWeight.
        // hence you should have access to the weight variable
        // this also means the ones you are trying to access should also be initialised
        // but here when the object itself is of type parent class, how will you call the constructor.
        //hence error

//        BoxWeight box7 = new  Box(1,2,3);
//        System.out.println(box7.weight);


//        BoxWeight box = new BoxWeight();
//        System.out.println(box.l +" " +box.l +" " + box.w +" " + box.weight);
//
//        BoxWeight box1 = new BoxWeight(2.3,4.5,6.7,8.9);
//        System.out.println(box1.l +" " +box1.l +" " + box1.w +" " + box1.weight);

        BoxPrice box = new BoxPrice(4,5,6);







    }
}
