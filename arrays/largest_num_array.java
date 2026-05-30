package arrays;

import java.util.Scanner;

public class largest_num_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  elements to enter into an array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int x = 0;
        System.out.println("enter the " + size + " elements into the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" " );
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        System.out.println();
        System.out.println("The Largest number is : " + x);
        sc.close();
    }
}
