package protectedSpecifier;

public class Vehicle {
    // File: Vehicle.java
    protected String vehicleType;

    // Constructor
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Protected method
    protected void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
    }

}
