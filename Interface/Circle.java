package Interface;

// Class implementing the Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double r) {
        this.radius = r;
    }

    // Implementation of calculation method for Circle
    @Override
    public double calculation() {
        return PI * radius * radius;
    }

    // Implementation of displayInfo method for Circle
    @Override
    public void display() {
        System.out.println("Circle - Radius: " + radius);
    }
}
