package arrays;

public class ArraysUsingFinal {
    public static void main(String[] args) {
        final int arr[]={1,2};
        // for arrays it is valid
        int a=arr[0]=100;
        System.out.println(a);
    }
}
