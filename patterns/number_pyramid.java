package patterns;

public class number_pyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++)
        {  
             // printing spaces
             for(int j=1;j<=n-i;j++)
             {
                  System.out.print(" ");
             }
             //printing increasing number
             for(int j=1;j<=i;j++)
             {
                System.out.print(j);
             }
             for(int j=i-1;j>0;j--)
             {
                System.out.print(j);
             }
             System.out.println();
        }
    }
}
