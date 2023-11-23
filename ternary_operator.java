import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("enter a number=");
        number=scanner.nextInt();
        // Using the ternary operator to determine if the number is even or odd
        String result = (number % 2 == 0) ? "number is even" : "number is odd";

        // Printing the result
        System.out.println("\nThe number is " + result + ".");
        scanner.close();
    }
}
