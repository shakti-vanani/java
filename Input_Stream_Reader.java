import java.io.*;

public class Input_Stream_Reader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Data.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            int data;
            while ((data = isr.read()) != -1) {
                char character = (char) data;
                System.out.print(character);
            }

            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
