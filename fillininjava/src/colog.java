import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class StudentData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        float cgpa;
        int no;

        System.out.print("How many data of students: ");
        no = input.nextInt();
        input.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("STUDENTDATA.txt"))) {
            for (int i = 0; i < no; i++) {
                System.out.print("Enter the name: ");
                name = input.nextLine();
                System.out.print("Enter age: ");
                age = input.nextInt();
                System.out.print("Enter the CGPA: ");
                cgpa = input.nextFloat();
                input.nextLine();

                writer.write("Name: " + name + ", Age: " + age + ", CGPA: " + cgpa);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();

            input.close(); 
        }
    }
}