package OOP.AccessControl;

public class ObjectClass {
    int num;
   float gpa;
    public ObjectClass(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }


// these two are already read.
    // to string gives the string representation.
    @Override
    public String toString() {
        return super.toString();
    }
// finalize gets called when garbage collection hits.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
//        return  this.num = ((ObjectClass)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //hashcode will give unique numbers for every single object that you create.
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(12, 78.9f);
        ObjectClass obj1 = new ObjectClass(12, 67.9f);
        System.out.println(obj.hashCode()); // unique number for obj
        System.out.println(obj1.hashCode()); // unique number for this obj as well

        // equals method:

/* == is comparison operator which checks wheather these two variables are pointing to the same object or not*/
        if (obj == obj1){
            System.out.println("obj is eqaul to obj1");

        }
        // .eqauls() is method which is checking the content of the variables.
        if (obj.equals(obj1)){
            System.out.println("obj is eqaul to obj1");

        }
    }
}
