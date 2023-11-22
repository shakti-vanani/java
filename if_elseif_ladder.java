import java.util.Scanner;
public class if_elseif_ladder {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter three numbers
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        // Using if-else-if statement to find the maximum
        if (n1 > n2 && n1 > n3) {
            System.out.println("The maximum number is: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The maximum number is: " + n2);
        }else if(n3 > n1 && n3 > n2){
            System.out.println("The maximum number is: " + n3);
        }else  {
            System.out.println("all numbers are equal");
        }
        // Closing the Scanner to prevent resource leak
        scanner.close();
    }
}