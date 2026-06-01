package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Student sc = new Student("yash", 100000);
        sc.diplayInfo();
    }
}

class Student {

    String name;
    int salary;

    // parameterised constructor
    public Student(String n, int s) {
        name = n;
        salary = s;
    }

    void diplayInfo() {
        System.out.println(" Name : " + name);
        System.out.println("Salary :" + salary);
    }

}