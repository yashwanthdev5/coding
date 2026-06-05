package Strings;

public class FindingWithoutLength {
    public static void main(String[] args) {
        String s="yash";
        int i=0;
        int index;
        try
        {

            while (true) {
                char c=s.charAt(i);
                index=s.indexOf(c);
                if(index==-1)
                {
                    break;
                }
                i++;
                
            }
        }catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("length"+i);
    }
}
