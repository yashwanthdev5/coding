package List;

import java.util.ArrayList;
import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        // add()
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        // add(index,100)
        arr.add(1,100);
        // set(2,200)
        arr.set(2, 200);
        // get(0)
        Integer i=arr.get(0);
        System.out.println(i);
        // remove()
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.contains(0));
        // Interger.valueof(200) to directly delete object
        // size()
        System.out.println(arr.size());
        // isEmpty()
        System.out.println(arr.isEmpty());
        // clear method used to clear ArrayList
        arr.clear();
        System.out.println(arr);


    sc.close();
    }
}
