import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

 class ObjectDeserialization {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("pdat"))) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialized object: " + person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error.");
            e.printStackTrace();
        }
    }
}
