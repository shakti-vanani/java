import java.util.Scanner;
public class relational_op {
     public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Arithmetic operators
        int no1, no2;
        System.out.println("enter no1=");
        no1 = Scanner.nextInt();
        System.out.println("enter no2=");
        no2 = Scanner.nextInt();

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("Is no1 equal to no2? " + (no1 == no2));
        System.out.println("Is no1 not equal to no2? " + (no1 != no2));
        System.out.println("Is no1 greater than no2? " + (no1 > no2));
        System.out.println("Is no1 less than or equal to no2? " + (no1 <= no2));
        Scanner.close();
    }
}
