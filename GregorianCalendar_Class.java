import java.util.GregorianCalendar;

public class GregorianCalendar_Class{
    public static void main(String[] args) {
        // Create a GregorianCalendar instance 
        GregorianCalendar C = new GregorianCalendar();

        // Accessing individual components of the date
        int Year = C.get(GregorianCalendar.YEAR);
        int Month = C.get(GregorianCalendar.MONTH) + 1; // Month is 0-based
        int Day = C.get(GregorianCalendar.DAY_OF_MONTH);
        int Hour = C.get(GregorianCalendar.HOUR_OF_DAY);
        int Minute = C.get(GregorianCalendar.MINUTE);
        int Second = C.get(GregorianCalendar.SECOND);

        System.out.println("Current Year="+Year);
        System.out.println("Current Month="+Month);
        System.out.println("Day of Month="+Day);
        System.out.println("Hour="+Hour);
        System.out.println("Minute="+Minute);
        System.out.println("Second="+Second);
        System.out.println("Current Date: " + Year + "/" + Month + "/" + Day);
        System.out.println("Current Time: " + Hour + ":" + Minute + ":" + Second);
    }
}
