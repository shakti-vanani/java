public class VarargsExample {
    // Varargs method to calculate the sum of integers
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
        // Varargs method can be called with any number of arguments
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum: " + sum(10, 20, 30));
        System.out.println("Sum: " + sum(5, 10, 15, 20, 25, 30));
    }
}
