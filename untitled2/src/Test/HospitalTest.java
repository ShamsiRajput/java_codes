package Test;
import hospital.Patient;
import hospital.Inpatient;
import hospital.details.Outpatient;


public class HospitalTest {
    public static void main(String[] args) {


        Patient patient = new Patient("Muhammad", 18, "illness", "03214430159");
        patient.displayDetails();
        Inpatient inpatient = new Inpatient("Ghaliya", 20, "physical illness", "3222333", 18, "22");
        inpatient.displayInpatientDetails();
        Outpatient outpatient = new Outpatient("Shamsi", 22, "No illness", "2444424");
        outpatient.displayDetails();

    }
}
