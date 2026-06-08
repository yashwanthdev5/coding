package List;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> names=new LinkedList<>();
        System.out.println("Enter the Size : ");
        int n=sc.nextInt();
        sc.nextLine();//consumes next line
        // String name="yashwanth";
        for(int i=0;i<n;i++)
        {
            
            names.add(sc.nextLine());
            // if (name.equals(names.get(i))) {
            //     break;
            // }
             // tricky part because indices gets changed 
            // if (name.equals(names.get(i))) {
            //     names.addLast(names.get(i));
            //  }
            //  System.out.println(names);
        }
        // Using Linked list methods
        names.addFirst("yashwanth");
        names.addLast("devarakonda");
        System.out.println(names);
        // System.out.println("Enter the index which you to appeared :");
        // n=sc.nextInt();
        // Using getFirst method
        System.out.println(names.getFirst());
        //using remove last and first
        System.out.println(names.getLast());
        System.out.println(names);
        names.removeFirst(); 
        System.out.println(names);
        // removing last
        names.removeLast();
        System.out.println(names);
        
        sc.close();
    }
}
