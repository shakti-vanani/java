import java.util.Scanner;
// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

// Example class using the custom exception
public class UserDefinedException{
    public static void main(String[] args) {
        Scanner Scann=new Scanner(System.in);
        System.out.println("enter any number=");
        int num=Scann.nextInt();
        try {
            // Code that may cause your custom exception
            int number=Operation(num);
            System.out.println("Operation Performed For even number"+number);
        } catch (OddNumberException e) {
            // Catch block handles your custom exception
            System.out.println("Caught OddNumberException: " + e.getMessage());
        }
        Scann.close();
    }

    // Method that may throw your custom exception
    private static int Operation(int no) throws OddNumberException {
        if (no % 2 != 0) {
            // Throw your custom exception if the number is odd
            throw new OddNumberException("Operation not allowed for odd numbers");
        }
        return no;
    }
}
