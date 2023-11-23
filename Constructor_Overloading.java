public class Constructor_Overloading {
    // Default constructor
    public Constructor_Overloading() {
        System.out.println("Default constructor");
    }
    // Constructor with one parameter
    public Constructor_Overloading(int x) {
        System.out.println("Constructor with one parameter: " + x);
    }
    // Constructor with two parameters
    public Constructor_Overloading(int x, int y) {
        System.out.println("Constructor with two parameters: " + x + ", " + y);
    }

    public static void main(String[] args) {
        new Constructor_Overloading();
        new Constructor_Overloading(5);
        new Constructor_Overloading(8,10);
    }
}