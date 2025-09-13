interface Person{

    void displayinfo();


}
class Student implements  Person{
    protected String stuid;
    protected String enrolledsubj;
    protected double grade;

    public Student(String name, int age, String address, String stuid, String enrolledsubj, double grade){
        this.stuid=stuid;
        this.enrolledsubj=enrolledsubj;
        this.grade=grade;
    }
   public void displayinfo(){
        System.out.println("student id: "+ stuid+ ", enrolled subjects: "+ enrolledsubj+", grade: "+grade);
    }

}
class Teacher implements Person{
    protected String department;
    protected double salary;
    protected String subject;
    public Teacher(String name, int age, String address, String department, String subject, double salary){

        this. department=department;
        this.subject=subject;
        this.salary=salary;
    }

    public void displayinfo() {
        System.out.println("department: "+department+", subject: "+subject+ ", salary: "+salary);
    }
}



public class main2 {
    public static void main(String[] args) {
        Person stu=new Student("zahra", 21, "lahore" , "0009","se", 3.0);
        Person tea = new Teacher("shamsi", 22, "main channu","foit", "programing",99999999.0);
        stu.displayinfo();
        tea.displayinfo();
    }
}
