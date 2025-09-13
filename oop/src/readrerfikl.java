import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class FileReading {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            String uni;
            int roll;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file reading.");
            e.printStackTrace();
        }
    }
}
