    import java.util.Scanner;
    public class operator_Example {
        public static void main(String[] args) {
            Scanner Scanner=new Scanner(System.in);
            // Arithmetic operators
            int no1,no2;
            System.out.println("enter no1=");
            no1=Scanner.nextInt();
            System.out.println("enter no2=");
            no2=Scanner.nextInt();    
            System.out.println("Arithmetic Operators:");
            System.out.println("Addition: " + (no1 + no2));
            System.out.println("Subtraction: " + (no1 - no2));
            System.out.println("Multiplication: " + (no1 * no2));
            System.out.println("Division: " + (no1 / no2));
            System.out.println("Modulus: " + (no1 % no2));
    
            // Relational operators
            System.out.println("\nRelational Operators:");
            System.out.println("Is no1 equal to no2? " + (no1 == no2));
            System.out.println("Is no1 not equal to no2? " + (no1 != no2));
            System.out.println("Is no1 greater than no2? " + (no1 > no2));
            System.out.println("Is no1 less than or equal to no2? " + (no1 <= no2));
    
            // Logical operators
            boolean b1 = true;
            boolean b2 = false;
    
            System.out.println("\nLogical Operators:");
            System.out.println("Logical AND: " + (b1 && b2));
            System.out.println("Logical OR: " + (b1 || b2));
            System.out.println("Logical NOT: " + (!b1));
    
            // Increment and Decrement operators
            int count;
            System.out.println("enter count=");
            count=Scanner.nextInt();
            System.out.println("\nIncrement and Decrement Operators:");
            System.out.println("Before increment or Decrement count=" + count);
            count++;
            System.out.println("After increment: " + count);
            count--;
            System.out.println("After decrement: " + count);
            Scanner.close();
        }
    }