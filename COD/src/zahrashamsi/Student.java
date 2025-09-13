package zahrashamsi;

public class Student extends person{

    Float gpa;
    private String invoice;

    public Student(String name, int age, String address, String bloodgroup, String deprt, String dob, String subject, String id, Float gpa, String invoice) {
        super(name, age, address, bloodgroup, deprt, dob, subject, id);
        this.gpa = gpa;
        this.invoice = invoice;
    }

    public String getInvoice() {
        return invoice;
    }
    void displaystu(){
        super.displayPerson();
        System.out.println("CGPA"+ gpa);
        System.out.println("invoices: "+invoice);

    }
}
