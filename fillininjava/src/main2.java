import java.io.File;
import java.io.IOException;

class Main2 {
    public static void main(String[] args) {
        try {
            // Use a valid file name
            File file = new File("Notebook.txt");

            if (file.createNewFile()) {
                System.out.println("The file " + file.getName() + " is created successfully.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file:");
            e.printStackTrace();
        }
    }
}
