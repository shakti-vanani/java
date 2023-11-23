public class shift_operator {
    public static void main(String[] args) {

        int originalVal = 10; // Binary: 1010

        // Left shift by 2 positions
        int leftShiftAns = originalVal << 2;

        // Right shift by 2 positions
        int rightShiftAns = originalVal >> 2;

        // Zero-fill right shift by 2 positions
        int zeroFillRightShiftAns = originalVal >>> 2;

        // Displaying the results
        System.out.println("Original Value= " + originalVal);
        System.out.println("Left Shift Result= " + leftShiftAns);
        System.out.println("Right Shift Result= " + rightShiftAns);
        System.out.println("Zero-fill Right Shift Result= " + zeroFillRightShiftAns);
    }
}
