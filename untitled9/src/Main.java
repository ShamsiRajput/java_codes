
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;
class Main{
    public static void main(String[] args) {
        int numsub;
        System.out.print("Enter the num of subjects:");
        Scanner input=new Scanner(System.in);
        numsub=input.nextInt();
        input.nextLine();
        String []subject=new String[numsub];
        for(int i=0;i<numsub;i++){
            System.out.print((i+1)+" subject name:"); subject[i]=input.nextLine();


        }
        System.out.println("subject info: ");
        for(int i=0;i<subject.length;i++){

            System.out.println(subject[i]+" :");
        }


int []numstu=new int[numsub];
        for(int i=0;i<subject.length;i++){
            System.out.println("Enter the student of: "+ subject[i]+" : ");
            numstu[i]=input.nextInt();


        }

        System.out.println("Subject with students:");
        for(int i=0;i<subject.length;i++){
            System.out.println(subject[i]+": "+numstu[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("num of students:");
        for(int i=0;i<subject.length;i++){

            System.out.print ("       "+numstu[i]+"              ");
        }
        System.out.println();

        System.out.println();
        System.out.print("sub info: ");
        for(int i=0;i<subject.length;i++){
            System.out.print("           "+subject[i]+"       ");
        }


        System.out.println();
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i] + "  ");

            // Print '*' based on the value in numstu[i]
            for (int j = 0; j < numstu[i]; j++) {
                System.out.print("* ");
            }

            // Print value at the end of the bar
            System.out.println("  " + "("+numstu[i]+")");
        }


    }




}