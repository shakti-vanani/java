import java.util.Scanner;
public class boolean_op {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Boolean Logical operators
        boolean b1, b2;
        //enter only true or false value
        System.out.println("enter b1=");
        b1 = Scanner.nextBoolean();
        System.out.println("enter b2=");
        b2 = Scanner.nextBoolean();

       System.out.println("\nLogical Operators:");
       System.out.println("Logical AND: " + (b1 && b2));
       System.out.println("Logical OR: " + (b1 || b2));
       System.out.println("Logical NOT: " + (!b1));
        Scanner.close();
    }
}
