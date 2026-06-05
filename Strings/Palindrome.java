package Strings;

public class Palindrome {
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("yash");
        StringBuilder s1 = new StringBuilder("yash");
        
        s1.reverse();
        // here the string builder doesn't override so we have to convert to string
        // for Stringbuilder equals acts a '=='
        if (s.toString().equals(s1.toString())) {
        System.out.println("String is a palindrome");
        } else {
        System.out.println("Not a palindrome");
        }
    }
}
