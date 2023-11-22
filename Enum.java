// Define an enum named Day
enum Dayofweek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Enum {
    public static void main(String[] args) {
        // Using the Day enum
        Dayofweek today = Dayofweek.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's the first day of the week");
                break;
            case WEDNESDAY:
                System.out.println("It's the middle of the week");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend");
                break;
            default:
                System.out.println("It's a regular day");
        }
    }
}
