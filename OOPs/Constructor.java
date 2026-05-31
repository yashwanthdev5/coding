package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Student sc = new Student();
    }
}
class Student{
    static{
        System.out.println("In static block ");
    }
    // parameterised constructor
    public Student(String name)
    {
        System.out.println("In parameterised constructor ");
        System.out.println("Name : "+ name);
    }
    // default constructor
    public Student()
    {
        System.out.println("In default constructor ");
    }
    
}