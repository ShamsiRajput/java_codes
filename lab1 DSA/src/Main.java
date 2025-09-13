import java.util.*;

class Student {
    private char[] name = new char[20];
    float cgpa;

    public void setName(char[] name) {
        this.name = name;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public char[] getName() {
        return name;
    }

    public void display() {
        System.out.println("Student Name: " + new String(name) + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[10]; // Array to hold 10 students

        for (int i = 0; i < 10; i++) {
            students[i] = new Student(); // Instantiate each student
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String studentName = input.nextLine();
            students[i].setName(studentName.toCharArray()); // Set name

            System.out.print("Enter CGPA for student " + (i + 1) + ": ");
            float studentCgpa = input.nextFloat();
            input.nextLine(); // Consume the newline character
            students[i].setCgpa(studentCgpa); // Set CGPA
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display(); // Display each student's details
        }

        input.close(); // Close the scanner
    }
}