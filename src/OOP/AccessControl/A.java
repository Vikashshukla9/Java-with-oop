package OOP.AccessControl;

public class A {
   private int num;
   public String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num ){
        this.num = num;
    }

   public A(int num, String name){
        this.num = num;
        this.name= name;
        this.arr = new int[num];
    }
}
