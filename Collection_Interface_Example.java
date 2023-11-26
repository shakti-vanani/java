import java.util.ArrayList;
import java.util.Collection;

public class Collection_Interface_Example {
    public static void main(String[] args) {
        // Creating an ArrayList (which implements Collection)
        Collection<String> Animals = new ArrayList<>();

        // Adding elements to the collection
        Animals.add("Yak");
        Animals.add("Rabbit");
        Animals.add("Horse");
        Animals.add("Element");

        // Removing an element from the collection
        Animals.remove("Yak");

        // Checking if the collection contains an element
        boolean containsRabbit = Animals.contains("Rabbit");
        System.out.println("Contains Rabbit= " + containsRabbit);

        // Getting the size of the collection
        int size = Animals.size();
        System.out.println("Size of Collection= " + size);

        // Iterating through the collection
        System.out.println("Animals:-");
        for (String animal : Animals) {
            System.out.println(animal);
        }

        // Clearing all elements from the collection
        Animals.clear();
        System.out.println("Collection after clearing: " + Animals);
    }
}
