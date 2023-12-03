import java.io.*;

public class Byte_Stream_Read_Example {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("output.txt");
             BufferedInputStream BIS = new BufferedInputStream(is)) {

            // Read bytes from the file into a byte array
            byte[] byteArray = new byte[1024];
            int bytesRead = BIS.read(byteArray);

            // Convert bytes to String and print
            String data = new String(byteArray, 0, bytesRead);
            System.out.println("Read Data: " + data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
