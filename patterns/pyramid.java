package patterns;

public class pyramid {
    public static void main(String args[]) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // printing spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
           
            // printing stars
           
            System.out.println();
        }
        // inverted pyramid
        for (int i = 5; i > 0; i--) {
            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
