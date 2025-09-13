import java.util.ArrayList;

class Student
{
    private String name;
    private ArrayList<Teacher> teachers;

    public Student(String name)
    {
        this.name = name;
        teachers = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public String getName()
    {
        return name;
    }

}

class Teacher {
    private String name;
    private ArrayList<Student> students;

    public Teacher(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }




    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher("John");
        Teacher teacher2 = new Teacher("Andrews");
        Teacher teacher3 = new Teacher("Hopkins");

        Student student1 = new Student("Kashif");
        Student student2 = new Student("Amir");
        Student student3 = new Student("Ahmed");
        Student student4 = new Student("Mat");
        Student student5 = new Student("Edwards");

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher1.addStudent(student3);

        teacher2.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        teacher3.addStudent(student1);
        teacher3.addStudent(student2);
        teacher3.addStudent(student3);
        teacher3.addStudent(student4);
        teacher3.addStudent(student5);

        student1.addTeacher(teacher1);
        student1.addTeacher(teacher3);

        student2.addTeacher(teacher1);
        student2.addTeacher(teacher2);
        student2.addTeacher(teacher3);

        student3.addTeacher(teacher1);
        student3.addTeacher(teacher2);
        student3.addTeacher(teacher3);

        student4.addTeacher(teacher2);
        student4.addTeacher(teacher3);

        student5.addTeacher(teacher2);
        student5.addTeacher(teacher3);

        System.out.println("Teacher1: " + teacher1.getName());
        for(Student var:teacher1.getStudents())
            System.out.println(var.getName());

        System.out.println("Teacher2: " + teacher2.getName());
        for(Student var:teacher2.getStudents())
            System.out.println(var.getName());

        System.out.println("Teacher3: " + teacher3.getName());
        for(Student var:teacher3.getStudents())
            System.out.println(var.getName());

        System.out.println("Student1: " + student1.getName());
        for(Teacher var:student1.getTeachers())
            System.out.println(var.getName());

}}