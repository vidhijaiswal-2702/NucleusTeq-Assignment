// Class with encapsulated data
class Student {
    // Private variables (data hiding)
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {  
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class encapsulationExample {
    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", 101, 85.5);

        
        System.out.println("Initial Student Details:");
        s1.displayDetails();

        s1.setName("Bob");
        s1.setRollNumber(202);
        s1.setMarks(95.0);

        System.out.println("\nUpdated Student Details:");
        s1.displayDetails();
    }
}

