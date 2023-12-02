import java.io.File;

public class FileClass_Example {
    public static void main(String[] args) {
        // Creating a File object
        File file = new File("Test.txt");

        // Checking if the file exists
        if (file.exists()) {
            System.out.println("File exists...");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
