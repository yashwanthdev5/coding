package List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int n=3;
        int m=10;
        for(int i=0;i<n;i++)
        {
            //adding elements into the stack
            s.push(m);
            m=m+10;
        }
        System.out.println(s);
        // peek means seeing the last element entered into the stack
        System.out.println(s.peek());
        // removes the last element from stack 
        System.out.println(s.pop());
        System.out.println(s);
        // s.clear();
        s.add(10);
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
        System.err.println(s.isEmpty());
    }
}
