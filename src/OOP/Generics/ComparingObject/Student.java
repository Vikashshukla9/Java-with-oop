package OOP.Generics.ComparingObject;

public class Student implements Comparable<Student> {
    int rollnum;
    float marks;

    public  Student(int rollnum, float marks){
        this.rollnum = rollnum;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff == 0, means both are equal.
        // if diff < 0, means o is greater
        // if diff > 0, means o is smaller

        return diff;
    }

    @Override
    public String toString() {
        return marks+"";
    }
}
