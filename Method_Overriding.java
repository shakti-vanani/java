// Superclass
class People {
    private String name;
    private int age;

    // Parameterized constructor
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void PrintData() {
        System.out.println("Person: Name=" + name + ", Age= " + age);
    }
}

// Subclass extending Person
class Employee extends People {
    private String empId;

    // Parameterized constructor
    public Employee(String name, int age, String employeeId) {
        // Call the constructor of the superclass using super()
        super(name, age);
        this.empId = employeeId;
    }

    // Override the PrintData() method in the superclass
    @Override
    public void PrintData() {
        // Call the PrintData() method of the superclass using super
        super.PrintData();
        System.out.println("Employee: Employee ID= " + empId);
    }
}

// Main class
public class Method_Overriding {
    public static void main(String[] args) {
        // Create an object of the subclass Employee
        Employee employee1 = new Employee("John Doe", 30, "E12345");

        // Call the overridden method
        employee1.PrintData();
    }
}
