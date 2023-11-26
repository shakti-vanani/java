public class JavaStringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str = "Hello, World!";

        // String Concatenation
        String fName = "John";
        String lName = "Doe";
        String FullName = fName + " " + lName;

        // String Methods
        String s = "   Java is a High-Level Programming Language   ";
        int slength = s.length();
        String trimmedString = s.trim();

        // String Comparison
        String password = "Secure123";
        boolean Check = password.equals("Secure123");

        // Substring
        String string = "This is a complete sentence.";
        String subpart = string.substring(0, 19);

        // Displaying Results
        System.out.println("string=" + str);
        System.out.println("Full Name= " + FullName);
        System.out.println("Length of string= " + slength);
        System.out.println("Trimmed string= " + trimmedString);
        System.out.println("Password is Correct " + Check);
        System.out.println("Substring of string= " + subpart);
    }

}
