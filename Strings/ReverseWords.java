package Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        
        String sentence=sc.nextLine();
        String[] sen =sentence.split(" ");
        for(int i=0;i<sen.length;i++)
        {
            String word =sen[i];
            for(int j=word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
        sc.close();
        }
}
