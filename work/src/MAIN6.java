// Base class
class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Child class for Teacher
class Teacher extends Person {
    private String subject;
    private double salary;
    private String department;

    // Constructor
    public Teacher(String name, int age, String address, String subject, double salary, String department) {
        super(name, age, address); // Call parent class constructor
        this.subject = subject;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Display teacher info
    public void displayTeacherInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}

// Child class for Student
class Student extends Person {
    private String studentId;
    private String enrolledSubjects;
    private double gradePointAverage;

    // Constructor
    public Student(String name, int age, String address, String studentId, String enrolledSubjects, double gradePointAverage) {
        super(name, age, address); // Call parent class constructor
        this.studentId = studentId;
        this.enrolledSubjects = enrolledSubjects;
        this.gradePointAverage = gradePointAverage;
    }

    // Getter methods
    public String getStudentId() {
        return studentId;
    }

    public String getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    // Display student info
    public void displayStudentInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Subjects: " + enrolledSubjects);
        System.out.println("GPA: " + gradePointAverage);
    }
}

// Main class to test inheritance
public class MAIN6 {
    public static void main(String[] args) {
        // Create Teacher and Student objects
        Teacher teacher = new Teacher("Alice Johnson", 35, "123 Main St", "Mathematics", 55000.00, "Science Department");
        Student student = new Student("John Smith", 20, "456 Elm St", "S12345", "Mathematics, Physics", 3.8);

        // Display details
        System.out.println("Teacher Details:");
        teacher.displayTeacherInfo();

        System.out.println("\nStudent Details:");
        student.displayStudentInfo();
    }
}
