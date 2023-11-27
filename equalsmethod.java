import java.util.Objects;

public class equalsmethod {
    private String name;
    private int age;

    public equalsmethod(String nm, int age) {
        this.name = nm;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object reference
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different classes or null
        }

        equalsmethod otherPerson = (equalsmethod) obj; // Type casting

        // Custom equality check based on content
        return age == otherPerson.age && Objects.equals(name, otherPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        equalsmethod p1 = new equalsmethod("allen", 23);
        equalsmethod p2 = new equalsmethod("Bob", 25);
        equalsmethod p3 = new equalsmethod("allen", 23);

        // Using equals() method to compare Person objects
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false

        // Modifying the name of person2
        p2.setName("Alicia");

        // After modification, equals() still works correctly
        System.out.println(p1.equals(p2)); 
    }
}
