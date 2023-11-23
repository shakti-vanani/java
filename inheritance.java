// Base class (superclass)
class Animal {
    String name;
    //contructor
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
// Derived class (subclass)
class Dog extends Animal {
    // Additional attributes specific to Dog
    String breed;

    // Constructor for Dog
    public Dog(String name, String breed) {
        // Call the constructor of the superclass (Animal)
        super(name);
        this.breed = breed;
    }
    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog d1 = new Dog("Buddy", "Golden Retriever");

        // Access methods from the superclass (Animal)
        d1.eat();
        d1.sleep();

        // Access method from the subclass (Dog)
        d1.bark();
    }
}
