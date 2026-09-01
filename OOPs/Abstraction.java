package OOPs;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Scooter extends Vehicle {

    void start() {
        System.out.println("Scooter Started");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Vehicl c = new Scooter();
        c.start();
        c.stop();
    }
}
