// Define a class named Person
class People {
    // Instance variables
    String name;
    int age;

    // Constructor
    public People(String nm, int age) {
        this.name = nm;
        this.age = age;
    }

    // Method to display information about the person
    public void display() {
        System.out.println("Name is= " + name);
        System.out.println("Age is= " + age);
    }
}

public class class_example{
    
    public static void main(String[] args) {
        People p1=new People("allen",20);
        p1.display();

    }
}