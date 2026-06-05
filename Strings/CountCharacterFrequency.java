package Strings;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Yashwanth ");
        int count=0;
        int space_count=0;
        // Counting Characters
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c>='a'&&
                c<='z'||
                c>='A'&&
                c<='Z'
            ) {
                count++;
            }else if (c==' ') {
                space_count++;
            }
        }
        System.out.println("Character Count :"+count);
        System.out.println("Space Count :"+space_count);
    }
}
