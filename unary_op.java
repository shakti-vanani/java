import java.util.Scanner;

public class unary_op {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Unary operators
        int number;
        System.out.println("enter number=");
        number = Scanner.nextInt();
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Before increment or Decrement count=" + number);
        number++;
        System.out.println("After increment: " + number);
        number--;
        System.out.println("After decrement: " + number);
        int negatedNumber = -number;
        System.out.println("After unary minus operator: " + negatedNumber);
        //logical compliment operator
        boolean b1=true,b2=false;;
        boolean invertedb1=!b1,invertedb2=!b2;
        System.out.println("Before compliment: " + b1+"|After compliment: " + invertedb1);
        System.out.println("Before compliment: " + b2+"|After compliment: " + invertedb2);
        Scanner.close();
    }
}