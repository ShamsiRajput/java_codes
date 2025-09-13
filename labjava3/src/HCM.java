import java.sql.SQLOutput;
import java.util.Scanner;
public class HCM{
    public static void detail(String patient_name, int age, String ailment)
    {
        System.out.println("Patient name: " +patient_name+ " Age: " +"("+age+") "+" Ailment: " + ailment);

    }
    public static void detail(String doc_name, String spc)
    {
        System.out.print("doctor name: "+ doc_name + " speciality: " +spc );
    }
    public static void main(String[] args)
    {
        String pat_name, ailm, doc_name, spc;
        int age;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter patient name: ");
        pat_name= scanner.nextLine();

        System.out.println("enter patient ailment: ");
        ailm= scanner.nextLine();
        System.out.println("enter patient age: ");
        age= scanner.nextInt();

        System.out.println("enter doctor name: ");
        doc_name= scanner.next();
        System.out.println("enter spc: ");
        spc= scanner.next();
        detail(pat_name,age,ailm);
        detail(doc_name, spc);
        System.out.println();
        System.out.println("Patient: " + pat_name + " (" + age + ") is consulting Dr. " + doc_name + ", a specialist in " + spc + ", for " + ailm + ".");



    }
}