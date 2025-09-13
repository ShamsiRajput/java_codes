abstract class person{
    protected String name;
    protected int age;
    protected String address;
 abstract void displayinfo();
    public person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
class student extends person{
     protected String stuid;
     protected String enrolledsubj;
     protected double grade;

     public student(String name, int age, String address, String stuid, String enrolledsubj, double grade){
     super(name,age,address);
         this.stuid=stuid;
         this.enrolledsubj=enrolledsubj;
         this.grade=grade;
     }
     void displayinfo(){
         System.out.println("student id: "+ stuid+ ", enrolled subjects: "+ enrolledsubj+", grade: "+grade);
     }

}
class teacher extends person{
    protected String department;
    protected double salary;
    protected String subject;
    public teacher(String name, int age, String address, String department, String subject, double salary){
        super(name,age,address);
        this. department=department;
        this.subject=subject;
        this.salary=salary;
    }

    void displayinfo() {
        System.out.println("department: "+department+", subject: "+subject+ ", salary: "+salary);
    }
}



public class main1 {
    public static void main(String[] args) {
        person stu=new student("zahra", 21, "lahore" , "0009","se", 3.0);
        person tea = new teacher("shamsi", 22, "main channu","foit", "programing",99999999.0);
        stu.displayinfo();
        tea.displayinfo();
    }
}
