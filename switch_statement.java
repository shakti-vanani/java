import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        // A variable representing a day of the week
        int day;
        System.out.println("enter any day=");
        day = scann.nextInt();
        // Using a switch statement to perform actions based on the day
        switch (day) {
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day of the week!");
                break;
        }
        // Close the scanner to prevent resource leak
        scann.close();

    }
}
