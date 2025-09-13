import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjectSerialization {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pdat"))) {
            out.writeObject(person);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error.");
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
