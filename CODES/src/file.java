

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file {


    public static void main(String [] args){
        try( BufferedWriter output =new BufferedWriter(new FileWriter("muhammad.txt",false ))){

            String name="Muhammad";
            String name2="Zahra";
            String name3="Nimrah";
            output.write(name);
            output.newLine();
            output.write(name2);
            output.newLine();
            output.write(name3);
            output.newLine();;

        }




    catch(IOException E){
        System.out.println("sdabhcdh");
        E.printStackTrace();
    }

}}
