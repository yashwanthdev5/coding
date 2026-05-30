package patterns;

import java.util.Scanner;

public class right_triangle {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int i;
    int j;
    System.out.println("enter the how stars triangle you want to print");
    int size = sc.nextInt();
    // printing rows..
    for(i=1;i<=size;i++)
    {
        //printing columns...
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}
