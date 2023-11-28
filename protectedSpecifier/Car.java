package protectedSpecifier;
 // File: Car.java

public class Car extends Vehicle {
    private String brand;

    // Constructor
    public Car(String vehicleType, String brand) {
        super(vehicleType);
        this.brand = brand;
    }

    // Public method in the subclass that calls the protected method in the superclass
    public void displayCarInformation() {
        System.out.println("Brand: " + brand);
        displayInfo(); // Accessing protected method from the superclass
    }
}
