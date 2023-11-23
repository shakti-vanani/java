public class bitwise_logical_op {
    public static void main(String[] args) {
        // Assume we have two integer values
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        // Bitwise AND
        int andResult = a & b; // binary: 0001
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // binary: 0111
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // binary: 0110
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT (Unary)
        int notResultA = ~a; // binary: 1111_1111_1111_1111_1111_1111_1111_1010
        int notResultB = ~b; // binary: 1111_1111_1111_1111_1111_1111_1111_1100

        System.out.println("Bitwise NOT of a: " + notResultA);
        System.out.println("Bitwise NOT of b: " + notResultB);
    }
}
