import java.io.*;

class student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class objectinput_objectoutput_stream  {

    public static void main(String[] args) {
        // Serialize objects
        serializeObjects();

        // Deserialize objects
        deserializeObjects();
    }

    private static void serializeObjects() {
        // Specify the file path for serialization
        String filePath = "person.ser";

        // Create and serialize a Person object
        student personToSerialize = new student("John Doe", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(personToSerialize);
            System.out.println("Serialization completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeObjects() {
        // Specify the file path for deserialization
        String filePath = "person.ser";

        // Deserialize the Person object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            student deserializedPerson = (student) ois.readObject();
            System.out.println("Deserialization completed.");
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}