package DSA.Arrays_DSA;

import java.util.Scanner;

public class Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = InnerLargest_Element.Largest(arr);
        System.out.println("The Largest element in the array is :" + res);
        sc.close();
    }
}

class InnerLargest_Element {

    public static int Largest(int[] arr) {
        int max = arr[0];
        // used when array is empty 
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
