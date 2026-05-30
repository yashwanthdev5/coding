package methods;

public class Method_Overloading {
    public static void main(String args[]) {
        Inner in = new Inner();
        // calling method add (depending on the arguments we give it calls method)
        in.add(2.44, 23.35);
        in.add(23, 34);

    }
}

class Inner {
    // Method of type integer
    void add(int a, int b) {
        System.out.println("addition of numbers" + (a + b));
    }

    // Method of type double (decimal point numbers)
    void add(double a, double b) {
        System.out.println("addition of decimal point numbers is : " + (a + b));
    }
}
