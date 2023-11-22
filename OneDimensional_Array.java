
public class OneDimensional_Array{
    public static void main(String[] args) {
        // Creating a one-dimensional array of integers
        int[] myArray = new int[5];

        // Initializing elements in the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
        }

        // Accessing and printing elements
        System.out.print("Array Elements: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }
}
