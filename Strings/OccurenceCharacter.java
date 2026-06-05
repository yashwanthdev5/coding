package Strings;

import java.util.Scanner;

public class OccurenceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        System.out.println("Entered String : "+s );
        System.out.println("Enter the character that you want to find Occurences :");
        char ch =sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
     
        System.out.println("Occurence of Character "+ch+" is : "+count);
        sc.close();
    }
}
