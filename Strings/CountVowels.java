package Strings;

public class CountVowels {
    public static void main(String[] args) {
        //creating string builder
        StringBuilder s=new StringBuilder("aeiou aeiou aeiou aeiou aeiou aeiou aeiou");
        int count =0;
        //runnin loop from string length -1 to 0
        for(int i=s.length()-1;i>=0;i--)
        {   
            if (s.charAt(i)=='a'|| s.charAt(i)== 'e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println("Count of vowels is :"+count);
       
    }
}
