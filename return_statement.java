public class return_statement {
    
    // A method that adds two numbers and returns the result
    public static int addNumbers(int a, int b) {
        int sum = a + b;

        // Using the return statement to send the result back to the caller
        return sum;
    }
    public static void main(String[] args) {
        // Calling a method that uses a return statement
        int result = addNumbers(100,40);

        // Printing the result
        System.out.println("Sum: " + result);
    }

}
