package OOPs;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(" Enter the Numarator :");
            int numarator=sc.nextInt();
            System.out.println("Enter the denominator :");
            int denominator=sc.nextInt();
            double result = numarator/denominator;
        }catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
        finally{
            System.out.println("Program is executing ...");
            sc.close();
        }
    }
}
