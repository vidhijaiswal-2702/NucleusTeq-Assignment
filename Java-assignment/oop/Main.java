/*Create a class to represent a student with attributes like name, roll number, and marks.
Implement inheritance to create a "GraduateStudent" class that extends the "Student" class with additional features.
Demonstrate polymorphism by creating methods with the same name but different parameters in a parent and child class. */

// Parent Class: Student
class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor (Encapsulation)
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details (Polymorphism - Method Overriding)
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Child Class: GraduateStudent (Inheritance)
class GraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public GraduateStudent(String name, int rollNumber, double marks, String researchTopic) {
        super(name, rollNumber, marks);
        this.researchTopic = researchTopic;
    }

    // Overriding displayDetails() (Polymorphism - Method Overriding)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls parent class method
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student("Alice", 101, 85.5);
        System.out.println("Student Details:");
        s1.displayDetails(); // Calls Student's displayDetails()

        System.out.println("\nGraduate Student Details:");
        // Creating a GraduateStudent object
        GraduateStudent g1 = new GraduateStudent("Bob", 202, 90.0, "Machine Learning");
        g1.displayDetails(); // Calls GraduateStudent's overridden displayDetails()
    }
}
