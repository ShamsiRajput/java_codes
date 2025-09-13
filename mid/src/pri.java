import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    String name;
    int id;
    int age;

    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + ", id: " + id + ", age: " + age;
    }
}
class Main {
    public static void main(String[] args) {

        // PriorityQueue with custom comparator by id
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s.id));

        pq.offer(new Student("Shamsi", 12, 22));
        pq.offer(new Student("Ali", 10, 20));
        pq.offer(new Student("Ayesha", 15, 21));
PriorityQueue<Student> SORT=new PriorityQueue<>();
        System.out.println("Priority Queue sorted by id (lowest id = highest priority):");
        while (!pq.isEmpty()) {
            System.out.println(SORT.add(pq.poll())); // removes and shows highest priority
        }
    }
}
