package OOPs;

class Vehicle{
    String brand ="Honda";
    double speed =210;
    void displayInfo(){
        System.out.println("Brand and speed are : "+brand+" "+speed);
    }
}
class Car extends Vehicle{
    void startEngine()
    {
          System.out.println("Engine Start..");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Car c=new Car();
        c.displayInfo();
        c.startEngine();
    }
}
