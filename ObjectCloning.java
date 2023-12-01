class person implements Cloneable {
    private String name;
    private int age;

    public person(String nm, int age) {
        this.name =nm;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectCloning{
    public static void main(String[] args) {
        try {
            // Create an object
            person originalPerson = new person("John", 25);

            // Clone the object
            person clonedPerson = (person) originalPerson.clone();

            // Modify the cloned object
            clonedPerson.setName("Jane");
            clonedPerson.setAge(30);

            // Print original and cloned object details
            System.out.println("Original Person: " + originalPerson);
            System.out.println("Cloned Person: " + clonedPerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
