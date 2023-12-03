import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        // Writing data to a file
        writeToFile();

        // Reading data from the file
        readFromFile();
    }

    private static void writeToFile() {
        try (OutputStream os = new FileOutputStream("data.txt");
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
            
            // Data to be written
            String data = "Reading And Writting Using Byte Stream Classes!";

            // Convert the string to bytes
            byte[] byteArray = data.getBytes();

            // Write bytes to the file
            bos.write(byteArray);

            System.out.println("Data written to file successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        try (InputStream is = new FileInputStream("data.txt");
             BufferedInputStream bis = new BufferedInputStream(is)) {

            // Read bytes from the file into a byte array
            byte[] byteArray = new byte[1024];
            int bytesRead = bis.read(byteArray);

            // Convert bytes to String and print
            String data = new String(byteArray, 0, bytesRead);
            System.out.println("Read Data: " + data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
