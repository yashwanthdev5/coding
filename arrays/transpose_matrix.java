package arrays;

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the elements into the array :");
        for(int i=0;i<row;i++)
        {
            System.out.println("enter the elements into the "+(i+1)+" row");
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        // regular matrix ...
        System.out.println("Regular matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix");
        for(int j=0;j<col;j++){
           for(int i=0;i<row;i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
