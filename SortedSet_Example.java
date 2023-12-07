import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Example {
    public static void main(String[] args) {
        // Creating a SortedSet of Integers using TreeSet
        SortedSet<Integer> numberSet = new TreeSet<>();

        // Adding elements to the SortedSet
        numberSet.add(50);
        numberSet.add(12);
        numberSet.add(8);
        numberSet.add(10);

        // Accessing elements in ascending order
        System.out.println("Elements in ascending order:");
        for (Integer number : numberSet) {
            System.out.println(number);
        }

        // Accessing the first and last elements
        System.out.println("\nFirst element: " + numberSet.first());
        System.out.println("Last element: " + numberSet.last());

        // Removing an element
        numberSet.remove(2);

        // Accessing elements after removal
        System.out.println("\nElements after removal:");
        for (Integer number : numberSet) {
            System.out.println(number);
        }
    }
}

