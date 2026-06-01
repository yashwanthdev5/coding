package OOPs;

class Employee {
    private int id;
    private String name;
    private double salary;

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(-1000);
        System.out.println(e.getSalary());
    }
}
