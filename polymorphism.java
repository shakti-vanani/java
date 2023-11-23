// Base class (superclass)
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
// Derived class 1 (subclass)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
// Derived class 2 (subclass)
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        // Creating objects of different types
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        // Calling the draw method on different objects
        shape1.draw();  // Calls the draw method of Circle
        shape2.draw();  // Calls the draw method of Square
    }
}