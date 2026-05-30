package patterns;

public class right_aligned_triangle {
    public static void main(String args[]) {
        int n = 5;
        // printing rows ..
        for (int i = 5; i>0; i--) {
        //printing columns..
            //printing spaces 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        //reverted right aligned triangle
        for (int i = 1; i<=n; i++) {
        //printing columns..
            //printing spaces 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

}
