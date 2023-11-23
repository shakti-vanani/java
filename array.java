public class array {

    public static void main(String[] args) {
        // Declaring and initializing an array of Strings
        String[] fruits = { "Apple", "Banana", "Orange", "Grapes", "Mango" };

        // Accessing and printing elements of the array
        System.out.println("Fruits in the array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        // Modifying an element of the array
        fruits[3] = "Pineapple";

        // Accessing and printing the modified array
        System.out.println("\nModified fruits array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}