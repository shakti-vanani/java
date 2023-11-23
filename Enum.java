// Define an enum named Day
enum Dayofweek {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}
public class Enum {
    public static void main(String[] args) {
        // Using the Day enum
        Dayofweek today = Dayofweek.Wednesday;

        // Switch statement with enum
        switch (today) {
            case Monday:
                System.out.println("It's the first day of the week");
                break;
            case Wednesday:
                System.out.println("It's the middle of the week");
                break;
            case Friday:
                System.out.println("It's almost the weekend");
                break;
            default:
                System.out.println("It's a regular day");
        }
    }
}