// PublicSpecifier.java
public class PublicSpecifier {
    public static void main(String[] args) {
        // Creating an instance of myclass
        myclass myObj = new myclass();

        // Accessing public field
        System.out.println("Public field value: " + myObj.publicField);

        // Calling public method
        myObj.publicMethod();
    }
}
