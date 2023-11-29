package Interface;
// Main class
public class InterfaceExample{
    public static void main(String[] args) {
        // Creating an instance of the Circle class
        Circle c1 = new Circle(4.2);

        // Calling methods from the Shape interface
        c1.display();
        double area = c1.calculation();
        System.out.println("Area: " + area);

    }
}
