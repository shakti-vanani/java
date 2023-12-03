import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_AccessFile {
    public static void main(String[] args) {
        try {
            // Writing to a file
            RandomAccessFile File = new RandomAccessFile("example.txt", "rw");
            File.writeUTF("Hello, World!");

            // Moving to a specific position in the file
            File.seek(0);

            // Reading from the file
            String str = File.readUTF();
            System.out.println("Read from file: " + str);

            // Updating data at a specific position
            File.seek(8); // Move to the 7th byte
            File.writeUTF("java"); // Update the content

            // Moving back to the beginning
            File.seek(0);

            // Reading the updated content
            String updatedStr = File.readUTF();
            System.out.println("Updated content: " + updatedStr);

            // Closing the file
            File.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
