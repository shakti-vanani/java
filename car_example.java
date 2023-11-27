// Class definition
class Car {
    // Instance variables (members)
    String brand;
    String model;
    int year;
    public Object make;

    // Constructor (used to initialize object state)
    public Car(String brand, String model, int year) {
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
}

public class car_example {
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Accessing and modifying member variables
        car1.displayInfo(); // Display information about car1
        System.out.println(); // Add a newline for clarity

        car2.displayInfo(); // Display information about car2
        System.out.println(); // Add a newline for clarity

        // Modifying the year of car1
        car1.year = 2023;

        // Display updated information about car1
        car1.displayInfo();
    }
}