package OOPs;

    class Test {
   //Java allows you to access static members through an object reference.
    static int x = 10;
    int y = 20;
    }

public class static_tricky {

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 100;
        t1.y = 200;

        System.out.println(t2.x);
        System.out.println(t2.y);
    }
}

