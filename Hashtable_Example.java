import java.util.Hashtable;
import java.util.Map;

public class Hashtable_Example {
    public static void main(String[] args) {
        // Creating a Hashtable with String keys and Integer values
        Hashtable<String, Integer> ageTable = new Hashtable<>();

        // Adding entries to the Hashtable
        ageTable.put("Alice", 25);
        ageTable.put("Bob", 30);
        ageTable.put("Charlie", 22);

        // Accessing elements using key
        System.out.println("Age of Bob: " + ageTable.get("Bob"));

        // Checking if a key exists
        String searchKey = "Alice";
        if (ageTable.containsKey(searchKey)) {
            System.out.println(searchKey + " is in the Hashtable.");
        } else {
            System.out.println(searchKey + " is not in the Hashtable.");
        }

        // Iterating over entries using Map.Entry
        System.out.println("\nEntries in the Hashtable:");
        for (Map.Entry<String, Integer> entry : ageTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " years old");
        }

        // Removing an entry
        String removeKey = "Charlie";
        ageTable.remove(removeKey);

        // Displaying entries after removal
        System.out.println("\nEntries after removing " + removeKey + ":");
        for (Map.Entry<String, Integer> entry : ageTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " years old");
        }
    }
}
