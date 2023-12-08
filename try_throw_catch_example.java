public class try_throw_catch_example {

    // Method to validate age
    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            // Throw an IllegalArgumentException if age is invalid
            throw new IllegalArgumentException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            // Trying to validate age
            validateAge(15); 
            validateAge(30);
            validateAge(-5);  
        } catch (Exception e) {
            // Catching the exception and handling it
            System.err.println("IllegalArgumentException caught: " + e.getMessage());
        } finally {
            // Code that will always be executed, whether an exception occurs or not
            System.out.println("Age validation process completed.");
        }
    }
}