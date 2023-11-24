class Calculator {
    private int n1;
    private int n2;

    // Inner class for performing calculations
    class Addition {
        int sum() {
            return n1 + n2;
        }
    }

    // Constructor for the outer class
    public Calculator(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

    // Method to display the result using the inner class
    void PrintResult() {
        Addition a1 = new Addition();
        int result = a1.sum();
        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + result);
    }
}

public class Inner_Class_Example {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        Calculator calc = new Calculator(100, 20);

        // Displaying the result using the inner class
        calc.PrintResult();
    }
}