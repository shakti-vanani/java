
    public class Jagged_Array {
        public static void main(String[] args) {
            // Creating a jagged array
            int[][] jArray = new int[3][];
    
            // Initializing sub-arrays with different lengths
            jArray[0] = new int[]{1,2,3};
            jArray[1] = new int[]{1,2,3,4,5};
            jArray[2] = new int[]{1,2,3,4,5,6,7};
    
            // Accessing and printing elements
            for (int i = 0; i < jArray.length; i++) {
                for (int j = 0; j < jArray[i].length; j++) {
                    System.out.print(jArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
