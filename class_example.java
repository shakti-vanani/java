// Define a class named Person
class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Person(String nm, int age) {
        this.name = nm;
        this.age = age;
    }

    // Method to display information about the person
    public void displayData() {
        System.out.println("Name is= " + name);
        System.out.println("Age is= " + age);
    }
}

public class class_example{
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person p1 = new Person("allen", 30);

        // Call the displayInfo method to show information about the person
        p1.displayData();
    }
}
