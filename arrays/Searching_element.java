package arrays;

import java.util.Scanner;

public class Searching_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 45, 23, 567, 1, 4444 };
        System.out.print("Enter the element you want to search : ");
        try {
            int x = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    System.out
                            .println("Element found at " + i + " index and element " + arr[i] + " = entered element "
                                    + x);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("not found !!");
            }
        } catch (Exception e) {
            System.out.println("exception caught " + e);
        } finally {
            sc.close();
        }
    }
}
