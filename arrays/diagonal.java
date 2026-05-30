package arrays;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("enter the number of columns : ");
        int col = sc.nextInt();
        int sum_r = 0;
        int sum_l = 0;
        int[][] arr = new int[row][col];
        System.out.println("enter the elements into the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter into the "+i+"st row" );
            for (int j = 0; j < arr.length; j++){
                   arr[i][j]=sc.nextInt();
            }
        }
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                   System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
          
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.println("left diagonal element is :" + arr[i][j]);
                    sum_l = sum_l + arr[i][j];
                }

                if (i + j == row-1) {
                    System.out.println("right diagonal element is :" + arr[i][j]);
                    sum_r = sum_r + arr[i][j];
                }

            }
          
        }
          System.out.println("sum of left diagonal elements is :" + sum_l);
            System.out.println("sum of right diagonal elements is :" + sum_r);
        sc.close();

    }
}
