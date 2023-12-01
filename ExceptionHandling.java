import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner Scann=new Scanner(System.in);
        System.out.println("Enter a numerator=");
        int numerator=Scann.nextInt();
        System.out.println("Enter a divisor=");
        int divisor=Scann.nextInt();

        try {
            // Code that may cause an exception
            int Ans = divideNumbers(numerator,divisor);
            System.out.println("Result= " + Ans); // This line won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Catch block handles the exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Finally block always gets executed, whether an exception occurs or not
            System.out.println("Finally block executed");
        }
        Scann.close();
    }

    // Method that may throw an exception
    private static int divideNumbers(int numerator, int divisor) {
        if (divisor == 0) {
            // Throw an exception if the denominator is zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / divisor;
    }
}