import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_Io_Example {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "java.txt";

        // Write to the file
        writeToFile(filePath, "This is a Java.io Example!");

        // Read from the file and print the content
        String content = readFromFile(filePath);
        System.out.println("Content read from file: " + content);
    }

    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write content to the file
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read content from the file
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
