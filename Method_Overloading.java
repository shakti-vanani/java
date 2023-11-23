public class Method_Overloading {
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Method_Overloading example = new Method_Overloading();

        // Method calls based on the number and types of arguments
        System.out.println("Sum (int): " + example.add(2, 3));
        System.out.println("Sum (int): " + example.add(2, 3, 5));
        System.out.println("Sum (double): " + example.add(2.5, 3.5));
    }
}