package zahrashamsi;

public class MAIN {
    public static void main(String[] args) {


    Teacher objTEA=new Teacher("zahra",21,"123main","B+","BSSE","23/09/2003","SRE","0009","PHD","BEST LEADER SHIP");
    Student objSTU=new Student("Shamsi",22,"Mian Channu","B-","BSSE","01/01/2003","PROGRAMMING","0012",3.7F,"105360");
        System.out.println("Teacher information:");
        objTEA.displayTeacher();
        System.out.println("\nStudent Information:");
        objSTU.displaystu();
}}
