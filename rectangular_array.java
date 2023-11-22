public class rectangular_array{
    public static void main(String[] args) {
      
        // Creating a rectangular array
        int[][] rectangularArray = new int[3][4];

        // Initializing elements in the array
        for (int i = 0; i < rectangularArray.length; i++) {
            for (int j = 0; j < rectangularArray[i].length; j++) {
                rectangularArray[i][j]=i*5+j;
            }
        }

        // Accessing and printing elements
        for (int i = 0; i < rectangularArray.length; i++) {
            for (int j = 0; j < rectangularArray[i].length; j++) {
                System.out.print(rectangularArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
