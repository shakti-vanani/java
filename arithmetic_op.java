import java.util.Scanner;
public class arithmetic_op {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Arithmetic operators
        int no1, no2;
        System.out.println("enter no1=");
        no1 = Scanner.nextInt();
        System.out.println("enter no2=");
        no2 = Scanner.nextInt();
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (no1 + no2));
        System.out.println("Subtraction: " + (no1 - no2));
        System.out.println("Multiplication: " + (no1 * no2));
        System.out.println("Division: " + (float)(no1 / no2));
        System.out.println("Modulus: " + (no1 % no2));
        Scanner.close();
    }
}
