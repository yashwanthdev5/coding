package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMiniPractice
{
    public static void main(String[] args) {
        // Mini challenge
        Scanner sc =new Scanner(System.in);
        int highest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        int average=0;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the Number of Students that you want to enter the maks :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(" Enter the student "+(i+1)+" marks : ");
            list.add(sc.nextInt());
        }
        System.out.println("The List of Marks of the Students is :");
        System.out.println(list);
        for(int i=0;i<n;i++)
        {
             if(list.get(i)>highest)
             {
                highest=list.get(i);
             }
        }
        for(int i=0;i<n;i++)
        {
             if(list.get(i)<lowest)
             {
                lowest=list.get(i);
             }
        }
        for(int i=0;i<n;i++)
        {
             sum=sum+list.get(i);
        }
        average=sum/n;
        System.out.println("Highest Marks : "+highest);
        System.out.println("Lowes Marks : "+lowest);
        System.out.println("Average is : "+average);
        sc.close();
    }
}