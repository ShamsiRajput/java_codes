import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.write("Hello, World!");
            writer.newLine(); // Adds a newline
            writer.write("Java file handling is powerful.");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred during file writing.");
            e.printStackTrace();
        }
    }
}
