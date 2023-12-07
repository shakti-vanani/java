import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Accessing elements using forEach loop
        System.out.println("Elements in the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Adding an element at the beginning
        linkedList.addFirst("Orange");

        // Adding an element at the end
        linkedList.addLast("Grapes");

        // Accessing elements after modification
        System.out.println("\nElements after modification:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Removing an element by value
        linkedList.remove("Banana");

        // Removing the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Displaying elements after removal
        System.out.println("\nElements after removal:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
