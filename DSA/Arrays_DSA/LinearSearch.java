package DSA.Arrays_DSA;

import java.util.Scanner;

class Linear{
    public static int linearsearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length==0||arr==null)
            {
               return -1;
            }
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // user enters size of the array
        System.out.println("Enter the Array size :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements :");
        for(int i=0;i<arr.length;i++)
        {
            //users enters the elements into the array
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element you want to search :");
        int target=sc.nextInt();
        int res=Linear.linearsearch(arr,target);
        if(res>-1){
            System.out.println("The element found at Index : "+res);
        }else
        {
             System.out.println("The element not found");
        }
        
      sc.close();
    }
}
