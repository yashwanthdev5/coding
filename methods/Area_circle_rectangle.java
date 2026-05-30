package methods;

public class Area_circle_rectangle {
    public static void main(String[] args) {
        area ar = new area();
        double area_c = ar.circle_area(4);
        // formating output for only three decimal using (printf("%.3f",var_name))
        System.out.printf("area of a circle : %.3f", area_c);
        System.out.println();
        double area_r = ar.rect_area(4, 5);
        System.out.println("Area of rectangle is : " + area_r);

    }
}

class area {
    double circle_area(int r) {
        return Math.PI * r * r;
    }

    double rect_area(int l, int b) {
        return l * b;
    }
}
