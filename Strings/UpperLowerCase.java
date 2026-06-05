package Strings;

public class UpperLowerCase {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Yashwanth Devarakonda");
        int uppercount=0;
        int lowercount=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if (ch>='A'&& ch<='Z') {

                uppercount++;
            }else if (ch>='a'&&ch<='z') {
                lowercount++;
                
            }
        }
        System.out.println("Lower case Letters count :"+lowercount);
        System.out.println("Upper case Letters count :"+uppercount);
    }
}
