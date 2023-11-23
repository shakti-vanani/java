public class strictfp_keyword {
    public static void main(String[] args) {
        // Using strictfp for platform-independent floating-point calculations
        double result = calculations(10.11, 30.2);

        // Printing the result
        System.out.println("Result: " + result);
    }

    // A method with floating-point calculations
    private static double calculations(double a,double b) {
        return a * b;
    }
}
