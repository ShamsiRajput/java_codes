
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

class mian{

    public static void main(String[] args) {
        try (BufferedWriter writer=new BufferedWriter(new FileWriter("newfilebro.txt",true))){
         //   File file = new File("newfilebro.txt");
       //     if(file.createNewFile()){
writer.write("shamsi");
writer.newLine();
writer.write("zahra");
            //     System.out.println("file is creat:");
         //   }else{
              //  System.out.println("file is already exist");
            //}
        } catch (Exception e) {
            System.out.println("error:");
            e.printStackTrace();
        }

    }
}