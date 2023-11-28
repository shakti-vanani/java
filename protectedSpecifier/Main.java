 // File: Main.java
package protectedSpecifier;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car car = new Car("Car", "Toyota");

        // Accessing protected variables and methods
        car.displayCarInformation();
    }
}