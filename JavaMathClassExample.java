public class JavaMathClassExample {
    public static void main(String[] args) {
        // Basic Arithmetic Operations
        int add = Math.addExact(50, 13);
        int sub = Math.subtractExact(100, 45);
        long mul = Math.multiplyExact(60L, 7L);
        int quotient = Math.floorDiv(25, 4);

        System.out.println("Sum: " + add);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + quotient);

        // Trigonometric Functions
        double sineVal = Math.sin(Math.toRadians(30));
        double cosineVal = Math.cos(Math.toRadians(45));
        double tangentVal = Math.tan(Math.toRadians(60));

        System.out.println("Sine: " + sineVal);
        System.out.println("Cosine: " + cosineVal);
        System.out.println("Tangent: " + tangentVal);

        // Exponential and Logarithmic Functions
        double power = Math.pow(4, 3);
        double logarithm = Math.log(100);

        System.out.println("Power: " + power);
        System.out.println("Logarithm: " + logarithm);

        // Rounding Functions
        double ceilVal = Math.ceil(31.05);
        double floorVal = Math.floor(31.05);
        long roundVal = Math.round(31.05);

        System.out.println("Ceil: " + ceilVal);
        System.out.println("Floor: " + floorVal);
        System.out.println("Round: " + roundVal);

        // Square Root
        double squareroot = Math.sqrt(255.0);
        System.out.println("Square Root: " + squareroot);

        // Random Number Generation
        double randomVal = Math.random();
        System.out.println("Random Value: " + randomVal);

        // Constants
        double piVal = Math.PI;
        double eVal = Math.E;

        System.out.println("PI: " + piVal);
        System.out.println("E: " + eVal);
    }
}
