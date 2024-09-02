package OOP;

public class Constructor {
    public static void main(String[] args) {

        //default constructor

//        College vikash = new College();
//        System.out.println(vikash.rno);  // will return the default value

        // creating constructor:

        College vikash = new College(119, "vikash shukla", 99f);
        System.out.println(vikash.rno);
        System.out.println(vikash.name);
        System.out.println(vikash.marks);

        College rahul = new College();
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

//        College rahul = new College();  // in this case the name this keyword will do somethimg like this : this will be replaced by rahul and in sout statemenet it will be like rahul.rno and so on.


       vikash.Changename("Shukla");
       vikash.greeting();

       College random = new College(vikash);
        System.out.println(random.name);
        System.out.println(random.marks);


        // calling constructor from another constructor:


        College random1 = new College();
        System.out.println(random1.name);
    }
}
class College {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object.

    // for that w us the this keyword inside he method.

    void greeting(){
        System.out.println("hello my name is " +name);
        System.out.println("hello my name is " +this.name); // will give same output. this will be replaced by vikash.
    }

    void Changename(String newname){
        name = newname;
    }

    // when you call a costructor with zero values(arguments).

//    College(){
//        this.rno = 22;
//        this.name = "rahul";
//        this.marks = 89f;
//
//    }

    // college arpit = new college(17, "arpit", 89);
    // here this will be replaced by arpit.
    College(int roll, String name, float marks) { // it will work when you call a constructor wit three arguents.
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    College (College other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // calling the constructor from another constructor:

    College (){
        // internally = new college(99, "tajpratap", 88)
        this(99, "tejpratap", 88);

    }
}