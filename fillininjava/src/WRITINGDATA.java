import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.*;


class writeee{
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("story", true))){
           writer.newLine();
            writer.write("shmasi");
            writer.newLine();
            writer.write("yasir");
            writer.newLine();
            System.out.println("output in file:");



}catch(IOException E){
            System.out.println("arres");
            E.printStackTrace();
        }}}