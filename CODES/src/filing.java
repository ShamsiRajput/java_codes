
import java.io.File;
import java.io.IOException;

public class filing {

    public static void main(String [] args){

        try {
            File file = new File("ZAHRA.txt");
            if (file.createNewFile()) {

                System.out.println("file is open" + file.getName());


            } else {
                System.out.println("file is already exist:");
            }

        }
catch(IOException e){

   System.out.println("an error occour ");
    e.printStackTrace();
        }
    }


    }
