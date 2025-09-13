

import java.util.Scanner;
public class buis {
    String E_id,name;
    int year=12;
    int salary;
int t_s;
    Scanner input = new Scanner(System.in);

    String[] skill=new String [4];
   public buis() {
       System.out.println("Enter the Emply_id:");
       E_id = input.nextLine();
       System.out.println("Entee the name: ");
       name = input.nextLine();
       System.out.println("Enter the monthly salary: ");
salary=input.nextInt();

       System.out.println("Enter the skills:");

       for (int i = 0; i < 4; i++) {

           skill[i] = input.nextLine();

       }
   }

       public void display() {
           System.out.println("Employ-ID" + E_id);
           System.out.println("NAME: " + name);
           System.out.println("Monthly-Salary: " + salary);

           t_s = salary * year;
           System.out.println("total salary of year: " + t_s);

           System.out.print("[");

           for (int i = 0; i < 4; i++) {
               System.out.print(skill[i] + " ,");
           }
           System.out.println("]");



   }
   public static void main(String[] args) {
       for (int i = 0; i < 2; i++) {
           buis obj = new buis();
obj.display();

       }

   }


}
