

import java.io.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class yjagsd {
    public static void main(String[] args) {

        try(BufferedWriter writer =new BufferedWriter(new FileWriter("data.txt",true))) {

            String name = "shamsi!";
            int roll = 97;
            String uni = "UCP!";
            writer.write(name);
            writer.newLine();
            writer.write(uni);
            writer.newLine();
            writer.write(roll);
            writer.newLine();




        }




        catch(IOException e){

            System.out.println("error in file!");
            e.printStackTrace();

        }



    }


}
