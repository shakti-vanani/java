import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_Stream_Reader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Data.txt");
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {

            int data;
            while ((data = isr.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
