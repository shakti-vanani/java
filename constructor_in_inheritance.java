class Person {
    private String name;
    private int age;

    // Parameterized constructor in the superclass
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor invoked with name: " + name + ", age: " + age);
    }
    public void display() {
        System.out.println("Person: Name= " + name + ", Age= " + age);
    }
}

class Student extends Person {
    private int rollno;

    // Parameterized constructor in the subclass

    public Student(String name, int age, int studentId) {
        // Explicitly call the constructor of the superclass using super()
        super(name, age);
        this.rollno = studentId;
        System.out.println("Student constructor invoked with studentId: " + studentId);
    }

    // Additional method in the subclass
    public void displayStudentData() {
        System.out.println("Student: StudentId=" + rollno);
    }
    
}

public class constructor_in_inheritance {
    public static void main(String[] args) {
        // Creating an object of the subclass Student
        Student s1 = new Student("allen", 28, 50);

        // Calling methods from both superclass and subclass
        s1.display();           // Inherited from Person class
        s1.displayStudentData();    // Specific to Student class
    }
}
