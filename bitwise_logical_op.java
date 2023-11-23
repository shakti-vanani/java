public class bitwise_logical_op {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        // Bitwise AND
        int andAns = a & b; // binary: 0001
        System.out.println("Bitwise AND: " + andAns);

        // Bitwise OR
        int orAns = a | b; // binary: 0111
        System.out.println("Bitwise OR: " + orAns);

        // Bitwise XOR
        int xorAns = a ^ b; // binary: 0110
        System.out.println("Bitwise XOR: " + xorAns);

        // Bitwise NOT (Unary)
        int notAnsA = ~a; // binary: 1111_1111_1111_1111_1111_1111_1111_1010
        int notAnsB = ~b; // binary: 1111_1111_1111_1111_1111_1111_1111_1100

        System.out.println("Bitwise NOT of a: " + notAnsA);
        System.out.println("Bitwise NOT of b: " + notAnsB);
    }
}
