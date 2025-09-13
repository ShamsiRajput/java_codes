//import java.util.LinkedList;
//import java.util.Queue;
//
//class Student {
//
//    String name;
//    int id;
//    int age;
//
//    Student(String name, int id, int age) {
//        this.name = name;
//        this.id = id;
//        this.age = age;
//    }
//
//    public String toString() {
//        return "name: " + name + ", id: " + id + ", age: " + age;
//    }
//
//    // Corrected display method
//    static void display(Queue<Student> q) {
//        for (Student s : q) {
//            System.out.println(s);
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Queue<Student> ll = new LinkedList<>();
//
//        // Adding students to the queue
//        ll.offer(new Student("Shamsi", 1, 22));
//        ll.offer(new Student("Ali", 2, 20));
//        ll.offer(new Student("Ayesha", 3, 21));
//
//        System.out.println("Students in Queue:");
//        Student.display(ll); // Using the static display method
//
//        // Removing an element
//        System.out.println("\nRemoving from queue:");
//        Student removed = ll.poll();
//        System.out.println("Removed: " + removed);
//
//        // Displaying remaining queue
//        System.out.println("\nRemaining Queue:");
//        Student.display(ll);
//
//        // Searching for a student
//        String searchName = "Ali";
//        boolean found = false;
//
//        for (Student s : ll) {
//            if (s.name.equalsIgnoreCase(searchName)) {
//                System.out.println("\nFound: " + s);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("\nStudent with name '" + searchName + "' not found.");
//        }
//    }
//}
