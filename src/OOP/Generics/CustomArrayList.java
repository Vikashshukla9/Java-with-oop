package OOP.Generics;

import java.util.Arrays;

public class CustomArrayList {

    // creating our own ArrayList: here in this arraylist we're only able to work with integer values, not some other data type so for this we use generics which provides us parameterized type.

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    // LET SAY YOU WANT TO CREATE A ADD METHOD:

    public void add(int num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

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

    public  int remove(){
        int removed = data[--size];
        return removed;
    }

    // get function
    public int get(int index){
        return data[index];
    }

    // size function

    public int size(){
        return size;
    }

    public void set(int index, int value){
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

        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
        for (int i = 0; i <14 ; i++) {
            list.add(2 * i);

        }

        System.out.println(list);
    }
}
