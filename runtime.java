import java.util.Scanner;

public class runtime {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        
        // Read the first number from the user
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        
        // Read the second number from the user
        double number2 = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Perform addition
        double sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
