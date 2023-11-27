import java.util.Objects;

public class HashCodeMethod {
    public String name;
    public int age;

    public HashCodeMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        HashCodeMethod p1 = new HashCodeMethod("Alice", 25);
        HashCodeMethod p2 = new HashCodeMethod("Bob", 30);

        // Using hashCode() method
        int hashCode1 = p1.hashCode();
        int hashCode2 = p2.hashCode();

        System.out.println("HashCode for person1: " + hashCode1);
        System.out.println("HashCode for person2: " + hashCode2);
    }
}
