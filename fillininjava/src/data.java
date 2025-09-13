import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class data {
    public static void main(String[] args) {
        int[]arr=new int [5];
        System.out.println("Enter the number:");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("data.txt"))){
            for(int i=0;i<5;i++) {
                writer.write(arr[i]);



            }


        }catch(Exception e){
            System.out.println("error");
            e.printStackTrace();

        }

    }
}
