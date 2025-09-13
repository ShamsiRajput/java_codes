package zahrashamsi;

public class person {
    private String name;
    private int age;
    private String address;
    private String bloodgroup;
    private String deprt;
    String dob;

    String Subject;
    String id;

    public person(String name, int age, String address, String bloodgroup, String deprt, String dob, String subject, String id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.bloodgroup = bloodgroup;
        this.deprt = deprt;
        this.dob = dob;
        Subject = subject;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public String getDeprt() {
        return deprt;
    }
public void displayPerson(){

    System.out.println("name: "+name);
    System.out.println("age: "+ age);
    System.out.println("Adress: "+ address);
    System.out.println("DOB: "+dob);
    System.out.println("bloodGroup: "+ bloodgroup);
    System.out.println("department: "+ deprt);
    System.out.println("ID "+ id);
    System.out.println("Subjects: "+ Subject);


}
}
