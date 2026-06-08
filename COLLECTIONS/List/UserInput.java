package List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the Size of the List ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.print(list.get(2));
        sc.close();
    }
}
