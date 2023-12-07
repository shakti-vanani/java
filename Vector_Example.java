import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> stringVector = new Vector<>();

        // Adding elements to the Vector
        stringVector.add("Java");
        stringVector.add("seo");
        stringVector.add("C#");

        // Accessing elements using forEach loop
        System.out.println("Elements in the Vector:");
        for (String language : stringVector) {
            System.out.println(language);
        }

        // Updating an element
        stringVector.set(2, "JavaScript");

        // Removing an element
        stringVector.remove("C++");

        // Accessing elements after modification
        System.out.println("\nElements after modification:");
        for (String language : stringVector) {
            System.out.println(language);
        }
    }
}