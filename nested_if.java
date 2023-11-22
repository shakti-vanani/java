import java.util.Scanner;

public class nested_if {
    // A method to get the legal voting age (18 in this example)
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int votingAge = 18;
        // Prompting the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");

            // Nested if statement to check voting eligibility
            if (age >= votingAge) {
                System.out.println("You are eligible to vote!");
            } else {
                System.out.println("You are not eligible to vote yet.");
            }

        } else {
            System.out.println("You are a minor.");
        }

        // Closing the Scanner to prevent resource leak
        scanner.close();
    }

}
