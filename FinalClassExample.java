final class circle {
    // Constants
    private static final double PI = 3.14159;

    // Instance variables
    private double r;

    // Constructor
    public circle(double radius) {
        this.r = radius;
    }

    // Final method - cannot be overridden by subclasses
    public final double calculateArea() {
        return PI * r * r;
    }

    // Getter method for radius
    public double getR() {
        return r;
    }
}
public class FinalClassExample{
    public static void main(String[] args) {
        // Creating an instance of the final class
        circle c1 = new circle(5.0);

        // Accessing methods of the final class
        double radius = c1.getR();
        double area = c1.calculateArea();

        // Displaying the results
        System.out.println("Radius= " + radius);
        System.out.println("Area of circle= " + area);
    }
}