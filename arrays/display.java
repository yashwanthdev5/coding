package arrays;

import java.util.Scanner;


class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display obj = new display();
        int[] arr1= display.m1();
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        // passing array to method 
        int[] arr={1,2,3,4,5};
        obj.arrayToMethod(arr);
        // obj.display();
        // arrray of objects...
        ArrayOfObjects[] friend=new ArrayOfObjects[3];

        friend[0]=new ArrayOfObjects(1, "yash");
        friend[1]=new ArrayOfObjects(1, "yashwanth");
        friend[2]=new ArrayOfObjects(1, "yashwanth");
        for(int i=0;i<friend.length;i++)
        {
            System.out.println("name "+friend[i].no+" "+ friend[i].name);
        }
        obj.updatingArray();
        sc.close();
    }
}

public class display {
    Scanner sc = new Scanner(System.in);

    public display() {
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("name of " + i + "st person :" + names[i]);
        }

    }

    void updatingArray() {
        int arr[] = { 1, 13, 45, 23 };
        System.out.println("Element at index 2 before updating :" + arr[2]);
        // updating an array
        arr[2] = 576;
        System.out.println("Element at index 2 after updating an array :" + arr[2]);
    }
    // passing the array to the method
    void arrayToMethod(int[] arr)
    {
        // getting the values 
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    // returning arrays from methods
    public static int[] m1()
    {
        return new int[] {1,2,3,4};
    }
    
    }
    class ArrayOfObjects{
        int no;
        String name;
        public ArrayOfObjects(int no,String name)
        {
            this.no=no;
            this.name=name;
        }
}