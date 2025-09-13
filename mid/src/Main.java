//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Stack;
//
//class student {
//
//    String name;
//    int id;
//    int age;
//
//    student(String name, int id, int age) {
//
//        this.name = name;
//        this.id = id;
//        this.age = age;
//
//    }
//
//    public String toString() {
//
//        return "name: " + name + ", id " + id + ", age: " + age;
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Stack<student> obj = new Stack<>();
//        Stack<student> pop = new Stack<>();
//        obj.push(new student("shamsi", 12, 22));
//        obj.push(new student("Ali", 15, 20));
//        obj.push(new student("Ayesha", 18, 21));
//
//
//        for (student s : obj) {
//
//            System.out.println(s);
//
//        }
//        System.out.println();
//        System.out.println("after pop");
//
//        while (!obj.isEmpty()) {
//
//            System.out.println(pop.push(obj.pop()));
//
//        }
//
////        Collections.sort(obj, Comparator.comparing(s->(s.name)));
////
////        System.out.println(obj);
////
////
////    }
//
//        System.out.println("after sortng by id");
//
//        Stack<student> sort = new Stack<>();
//
//        while (!pop.isEmpty()) {
//            student temp = pop.pop();
//
//            while (!sort.isEmpty() && sort.peek().id < temp.id) {
//                pop.push(sort.pop());
//            }
//
//            sort.push(temp);
//        }
//
//        // Stack stores top at end, so print in reverse order for sorted output (optional)
//        for (student s : sort) {
//            System.out.println(s);
//        }
//
//        Stack<student> name = new Stack<>();
//        System.out.println("Sorted by name:");
//
//        while (!sort.isEmpty()) {
//            student temp = sort.pop();
//
//            while (!name.isEmpty() && name.peek().name.compareTo(temp.name) > 0) {
//                sort.push(name.pop());
//            }
//
//            name.push(temp);
//        }
//
//        // Display sorted stack
//        for (student s : name) {
//            System.out.println(s);
//        }
//
//        Stack<student>searchname=new Stack<>();
//boolean founded=false;
//        String search ="shamsi";
//        while(!name.isEmpty()){
//            student temp=name.pop();
//            if(temp.name.equals(search)){
//                System.out.println("founde this name"+ temp);
//
//founded=true;
//            }
//
//searchname.push(temp);
//
//
//        }
//
//        while(!searchname.isEmpty()){
//
//            name.push(searchname.pop());
//
//
//        }
//        if (!founded) {
//            System.out.println("Student with name '" + search + "' not found.");
//
//    }
//
//}}