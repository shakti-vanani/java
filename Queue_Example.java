import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (adding elements to the queue)
        queue.offer("allen");
        queue.offer("Scott");
        queue.offer("Smith");

        // Displaying the elements in the queue
        System.out.println("Queue elements: " + queue);

        // Dequeue (removing and retrieving the front element)
        String frontElement = queue.poll();
        System.out.println("Dequeued element: " + frontElement); 

        // Displaying the elements in the queue after dequeue
        System.out.println("Queue elements after dequeue: " + queue); 

        // Peek (retrieve the front element without removing it)
        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement); 

        // Displaying the elements in the queue after peek
        System.out.println("Queue elements after peek: " + queue); 

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty()); 
    }
}