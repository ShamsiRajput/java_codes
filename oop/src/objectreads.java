//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class ObjectDeserialization {
//    public static void main(String[] args) {
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
//            Person person = (Person) in.readObject();
//            System.out.println("Deserialized object: " + person);
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Deserialization error.");
//            e.printStackTrace();
//        }
//    }
//}import java.io.*;
//        import java.util.ArrayList;
//import java.util.List;
//
//class Person implements Serializable {
//    private String name;
//    private int age;
//
//    // Constructor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}
//
//class ObjectSerialization {
//
//    public static void main(String[] args) {
//        // Create some Person objects
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30));
//        people.add(new Person("Bob", 25));
//        people.add(new Person("Charlie", 35));
//
//        // Serialize objects into a file
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"))) {
//            for (Person person : people) {
//                out.writeObject(person);
//            }
//            System.out.println("Objects serialized.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Read the serialized objects back from the file
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat"))) {
//            Person person;
//            // Read multiple objects
//            while (true) {
//                try {
//                    person = (Person) in.readObject();
//                    System.out.println("Deserialized: " + person);
//                } catch (EOFException e) {
//                    break;  // End of file reached, exit the loop
//                }
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
