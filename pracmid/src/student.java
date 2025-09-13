//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedList;
//
//public class student {
//
//    String name;
//    int id;
//    int age;
//
//    public student(String name, int id, int age) {
//        this.name = name;
//        this.id = id;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                ", age=" + age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//
//        LinkedList<student> obj = new LinkedList<>();
//        obj.add(new student("shamsi", 94, 15));
//        obj.add(new student("aryan", 24, 56));
//        obj.add(new student("irfan", 84, 98));
//        obj.add(new student("yasir", 364, 123));
//        obj.add(new student("rahan", 345, 76));
//
//        for (student s : obj) {
//
//
//            System.out.println(s);
//        }
//
//
//        System.out.println("name sorting");
//        Collections.sort(obj, Comparator.comparing(u->u.name));
//            for(student s:obj){
//
//                System.out.println(s);
//            }
//
//        System.out.println("id sorting");
//            Collections.sort(obj,Comparator.comparing(u->u.id));
//            for(student s:obj){
//
//                System.out.println(s);
//
//
//
//
//        }
//
//
//        }
//
//
//
//
//
//
//
//}
