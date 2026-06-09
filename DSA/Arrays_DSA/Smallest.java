package DSA.Arrays_DSA;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = InnerSmallest_Element.Smallest(arr);
        System.out.println("The Smallest element in the array is :" + res);
        sc.close();
    }
}

class InnerSmallest_Element {

    public static int Smallest(int[] arr) {
        // used to check whether the array is empty if empty handles exception
         if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
        // Time complexity : O(n) because of loop 
        // space complexity : O(1)
    }
}
