
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class filereader {

    public static void main(String [] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("muhammad.txt"))){
String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

    }
    catch(IOException d){

        System.out.println("sfdtgfusd");


        d.printStackTrace();
    }

}}
