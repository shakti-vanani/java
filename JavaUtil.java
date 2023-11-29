import java.time.LocalDate;
import java.util.*;

public class JavaUtil {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> Animals = new ArrayList<>();
        Animals.add("Cat");
        Animals.add("Rabbit");
        Animals.add("Elephent");

        // Printing elements in the list
        System.out.println("Animals: " + Animals);

        // Getting the current date
        LocalDate cDate = LocalDate.now();
        System.out.println("Current Date: " + cDate);

        // Reading user input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();

        // Generating a random number
        Random random = new Random();
        int rNumber = random.nextInt(100);
        System.out.println("Random Number: " + rNumber);
    }
}
