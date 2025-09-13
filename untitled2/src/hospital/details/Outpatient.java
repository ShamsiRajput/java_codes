package hospital.details;
import hospital.Patient;

public class Outpatient extends Patient{
    public Outpatient(String name, int age, String medicalHistory, String contactNumber) {
        super(name, age, medicalHistory, contactNumber);
    }
    public void displayDetails()
    {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Medical History:" + medicalHistory);
        System.out.println("Contact Number:" + getContactNumber() );
    }

}
