import java.io.*;

public class Byte_Stream_Write_Example {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("output.txt");
             BufferedOutputStream BOS = new BufferedOutputStream(os)) {
            
            // Data to be written
            String data = "Hello, Byte Streams!";

            // Convert the string to bytes
            byte[] byteArray = data.getBytes();

            // Write bytes to the file
            BOS.write(byteArray);

            System.out.println("Data written to file successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
