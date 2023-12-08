import java.util.HashMap;
import java.util.Map;

public class Map_Example {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 95);

        // Accessing values using keys
        int aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's Grade: " + aliceGrade);

        // Checking if a key is present
        boolean containsBob = studentGrades.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + containsBob);

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
