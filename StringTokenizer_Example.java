import java.util.StringTokenizer;

public class StringTokenizer_Example {
    public static void main(String[] args) {
        // Example 1: Using default delimiters
        String inputStr1 = "Java High-Level Programming Language";
        StringTokenizer t1 = new StringTokenizer(inputStr1);

        System.out.println("Tokens using default delimiters:");
        while (t1.hasMoreTokens()) {
            String token = t1.nextToken();
            System.out.println("Token is= " + token);
        }

        // Example 2: Using specified delimiters
        String inputStr2 = "Hello Java!,Java High-Level Programming-Language";
        StringTokenizer t2 = new StringTokenizer(inputStr2, ",");

        System.out.println("\nTokens using custom delimiter (,):");
        while (t2.hasMoreTokens()) {
            String token = t2.nextToken();
            System.out.println("Token is= " + token);
        }
    }
}
