import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Streams_Example {

    public static void main(String[] args) {
        // Specify input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Example using InputStream, byte stream to read a file
        try (FileInputStream fis = new FileInputStream(inputFile)) {
            // Reading bytes from the input file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Process the bytes (here, we'll print them as characters)
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Example using OutputStream, character stream to write to a file
        try (FileOutputStream fos = new FileOutputStream(outputFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            // Writing characters to the output file
            String contentToWrite = "Hello, this is a sample content!";
            osw.write(contentToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Example using InputStreamReader, character stream to read a file
        try (FileInputStream fis = new FileInputStream(outputFile);
             InputStreamReader isr = new InputStreamReader(fis)) {
            // Reading characters from the output file
            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = isr.read(buffer)) != -1) {
                // Process the characters (here, we'll print them)
                System.out.print(new String(buffer, 0, charsRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}