// File: Book.java
package Library;

 class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Package-private method
    void Display() {
        System.out.println("Title= " + title);
        System.out.println("Author= " + author);
    }
}