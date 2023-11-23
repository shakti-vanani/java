// A class demonstrating encapsulation
class Person {
    private String name;  // private variable
    private int age;       // private variable

    // Getter method for the name variable
    public String getname() {
        return name;
    }
    // Setter method for the name variable
    public void setname(String name) {
        this.name = name;
    }
    // Getter method for the age variable
    public int getage() {
        return age;
    }
    // Setter method for the age variable with validation
    public void setage(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.provide a positive value.");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person p1 = new Person();
        // Setting values using setter methods (encapsulation)
        p1.setname("scott");
        p1.setage(20);

        // Getting values using getter methods (encapsulation)
        System.out.println("Name= " + p1.getname());
        System.out.println("Age= " + p1.getage());

        // Trying to set an invalid age
        p1.setage(-5);  // This will print an error message

        // Getting the updated age
        System.out.println("Updated Age: " + p1.getage());
    }
}