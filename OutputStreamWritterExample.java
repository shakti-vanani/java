import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWritterExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8")) {

            String text = "Hello, OutputStreamWriter!";
            osw.write(text);
            System.out.println("data written successfully");
            osw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
