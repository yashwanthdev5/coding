package controlflow;


public class largest_num {
    public static void main(String[] args) {
        number n = new number();
        int res = n.largest(3, 4);
        System.out.println(res);
    }
}
class number{
    int largest(int a, int b)
    {
        if(a>b)
        {
            return a;
            
        }else
        {
            return b;
        }
        
    }
}
