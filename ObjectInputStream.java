import java.io.*;

public class ObjectInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("object.ser");
            ObjectInputStream ois = new ObjectInputStream();

            // Read the object from the stream
            MyClass myObject = (MyClass) ois.readObject();
            
            System.out.println(myObject.getMessage());

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
