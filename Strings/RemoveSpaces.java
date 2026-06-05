package Strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String :");
        // String s=sc.nextLine();
        // //using split
        // String[] arr=s.split(" ");
        // for(int i=0;i<arr.length;i++)
        // {
        // System.out.print(arr[i]);
        // }
        // using String builder

        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);
    }
}
