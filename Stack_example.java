import java.util.Stack;

public class Stack_example {

    public static void main(String[] args) {
        // Creating a stack using java.util.Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Displaying the top element of the stack
        System.out.println("The top element of the stack is: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped: " + stack.pop()); // Output: Popped: 50
        System.out.println("Popped: " + stack.pop()); // Output: Popped: 40

        // Displaying the top element of the stack after popping
        System.out.println("The top element of the stack is now: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
    }
}