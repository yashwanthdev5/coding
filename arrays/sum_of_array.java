package arrays;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[3];
        int summm = 0;
        for (int i=0;i<sum.length;i++) {
            sum[i] = sc.nextInt();
        }
        for (int num=0;num<sum.length;num++) {
            summm = summm + sum[num];
        }
        System.out.println("sum of the array elements : " + summm);
        sc.close();
    }
}
