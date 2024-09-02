package OOP.Generics;

import java.util.Arrays;
import java.util.List;

// using wildcard you can restrict the type. either T should be Number or Subclasses of Number. Number is a class that has the few subclasses like Integer, Float etc.
public class WildCardExample<T extends Number> {     //T- type

    // creating our own ArrayList: here in this arraylist we're only able to work with integer values, not some other data type so for this we use generics which provides us parameterized type.

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List< Number> list){
        //do something
        //here you can pass the Number Type

    }

    public void getList1(List<? extends Number> list){
        //do something
        //here you can pass the Number Type and the subclasses of Number type as well.
        // this thing is called wildcard.

    }

    // LET SAY YOU WANT TO CREATE A ADD METHOD:

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array.

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    // now let's say you want to create remove function

    public  T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    // get function
    public T get(int index){

        return (T)data[index];
    }

    // size function

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();

        // these are the some functions that array list provides. will try to make this our own.
//        list.add(23);
//        list.remove(0);
//        list.get(1);
//        list.set(2,6785);
//        list.isEmpty();


        // now we'll use our own functions.

//        CustomGenericArrayList list = new CustomGenericArrayList();
////        list.add(3);
////        list.add(5);
////        list.add(9);
//        for (int i = 0; i <14 ; i++) {
//            list.add(2 * i);
//
//        }
//
//        System.out.println(list);
//        WildCardExample<String> list = new WildCardExample<>();   it will give error because T extands the Number class which can contain int, float class.
        WildCardExample<Integer> list = new WildCardExample<>();
//        list.add("sdaj"); it will give error, now it's working fine with generics

        for (int i = 0; i <13 ; i++) {
            list.add(2 * i);

        }
        System.out.println(list);
    }
}
