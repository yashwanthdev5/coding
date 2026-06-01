package OOPs;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        // super keyword used to call the overrided method of super class..
        super.draw();
        System.out.println("Drawing Rectangle");
    }
}

public class Inheritance_Task {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        Circle c = new Circle();
        c.draw();
    }
}
