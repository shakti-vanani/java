class NumberSwapper {
    private int no1;
    private int no2;

    // Static nested class for swapping numbers
    static class Swapper {
        static void swapnumber(NumberSwapper number) {
            int temp = number.no1;
            number.no1 = number.no2;
            number.no2 = temp;
        }
    }

    // Constructor for the outer class
    public NumberSwapper(int num1, int num2) {
        this.no1 = num1;
        this.no2 = num2;
    }

    // Method to display the numbers before and after swapping
    void displayNumbers() {
        System.out.println("Before Swaping: no1 = " + no1 + ", no2 = " + no2);
        Swapper.swapnumber(this);
        System.out.println("After Swaping: no1 = " + no1 + ", no2 = " + no2);
    }
}

public class static_nested_class_example {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        NumberSwapper Outerobj = new NumberSwapper(50, 10);

        // Displaying numbers before and after swapping using the static nested class
        Outerobj.displayNumbers();
    }
}
