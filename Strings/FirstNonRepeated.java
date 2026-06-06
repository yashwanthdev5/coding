package Strings;

import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        // creating String Builder
        StringBuilder s=new StringBuilder(sc.nextLine());
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            boolean idcheck=false;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                
                if(ch==s.charAt(j))
                {
                    if(j==i)
                    {
                    continue;
                    }
                    count=1;
                    break;
                }
                if (j==s.length()-1&& count!=1) {
                 System.out.println("Non repeated first character :"+ch);
                  idcheck=true;
                }
            }
            if(idcheck)
            {
                break;
            }
            count=0;
            
        }
       sc.close();
    }
}
