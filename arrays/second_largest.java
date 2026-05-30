package arrays;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int largest=0;
        int second_largest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
        System.out.println("second largest number is : "+second_largest);
        System.out.println("largest number is : "+largest);
        
    }
}
