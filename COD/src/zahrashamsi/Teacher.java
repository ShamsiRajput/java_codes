package zahrashamsi;

public class Teacher extends person{

    private String qualification;
    private String Experience;

    public Teacher(String name, int age, String address, String bloodgroup, String deprt, String dob, String subject, String id, String qualification, String Experience) {
        super(name, age, address, bloodgroup, deprt, dob, subject, id);
        this.qualification = qualification;
       this. Experience = Experience;
    }

    public String getExperience() {
        return Experience;
    }

    public String getQualification() {
        return qualification;
    }
    void displayTeacher(){
        super.displayPerson();
        System.out.println("teacher qualification: "+qualification );
        System.out.println("Teacher experience: "+ Experience);

    }
}
