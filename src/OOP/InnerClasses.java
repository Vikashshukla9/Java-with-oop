package OOP;

//static public class InnerClasses {   //outor classes can not be static because there is no class on which they can be dependent, only inner classes can or can't be static.

public class InnerClasses {

     static class Test {    // inner classes can be static because they are dependent on the outor class.  if you make this class as static then it is not dependent on the objects of the outor class.
         String name;

        public Test(String name) {
            this.name = name;
        }


        public static void main(String[] args) {  // it will produce the error when test class is not defined as static, because that class is dependent on other class.
            Test obj1 = new Test("vikash");
            Test obj2 = new Test("shukla");
            System.out.println(obj1.name);
            System.out.println(obj2.name);
        }
    }
}