public class PrivateSpecifier {
    // Private instance variables
    private String name;
    private int age;

    // Public constructor
    public PrivateSpecifier(String nm, int age) {
            this.name = nm;
            this.age = age;
        }

    // Public method to retrieve the name (getter)
    public String getName() {
        return name;
    }

    // Public method to set the name (setter)
    public void setName(String name) {
        // You can perform additional validation or logic here
        this.name = name;
    }

    // Public method to retrieve the age (getter)
    public int getAge() {
        return age;
    }

    // Public method to set the age (setter)
    public void setAge(int age) {
        // You can perform additional validation or logic here
        this.age = age;
    }

    // Private method accessible only within the Person class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method that can access the private method
    public void publicMethod() {
        System.out.println("Calling privateMethod from publicMethod:");
        privateMethod();
    }

    public static void main(String[] args) {
        // Creating an instance of the PrivateSpecifier class
        PrivateSpecifier person1 = new PrivateSpecifier("allen", 28);

        // Accessing public methods to get and set private variables
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Accessing a public method that calls a private method
        person1.publicMethod();
    }

}
