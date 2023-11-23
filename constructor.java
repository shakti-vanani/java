public class constructor {
    // Instance variables
    String brand;
    String model;
    int year;

    // Constructor
    public constructor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class using the constructor
        constructor Car1 = new constructor("Toyota", "Camry", 2022);

        // Accessing the displayInfo method to print information about the car
        Car1.displayInfo();
    }
}
