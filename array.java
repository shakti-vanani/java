public class array {

    public static void main(String[] args) {
        // Declaring and initializing an array of Strings
        String[] Animals = { "Cat", "dog", "Horse", "Cow"};

        // Accessing and printing elements of the array
        System.out.println("Array of Animals:");
        for (int i = 0; i < Animals.length; i++) {
            System.out.println(Animals[i]);
        }
        // Modifying an element of the array
        Animals[2] = "Tiger";
    
        // Accessing and printing the modified array
        System.out.println("\nModified Animals array:");
        for (String animal : Animals) {
            System.out.println(animal);
        }
    }
}