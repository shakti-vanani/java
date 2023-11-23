public class memberExample {
    // Static variable
    static int staticVar = 1;

    // Instance variable
    int instanceVar = 2;

    // Static method
    static void staticMethod() {
        System.out.println("Static method: " + staticVar);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method: " + instanceVar);
    }

    public static void main(String[] args) {
        // Accessing static members
        System.out.println("Accessing static variable: " + staticVar);
        staticMethod();

        // Creating an object of the class to access instance members
        memberExample obj = new memberExample();

        // Accessing instance members
        System.out.println("Accessing instance variable: " + obj.instanceVar);
        obj.instanceMethod();
    }
}
