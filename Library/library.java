// File: library.java
package Library;

public class library {
    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book b1 = new Book("Java Programming", "John Doe");

        // Accessing package-private variables and methods
        System.out.println("Book Information:");
        b1.Display();
    }
}
