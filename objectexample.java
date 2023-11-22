public class objectexample {
    // Fields (attributes or properties)
    int value;

    // Constructor
    public objectexample(int a) {
        this.value =a;
    }

    // Method
    public void displayField() {
        System.out.println("value is= " + value);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        objectexample obj = new objectexample(100);

        // Accessing fields and methods of the object
        obj.displayField();
    }

}
