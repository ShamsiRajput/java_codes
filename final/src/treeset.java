import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

class treeset {
    String name;
    int age;
    int id;

    treeset(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString() {
        return "name: " + name + ", age: " + age + ", id: " + id;
    }

    public static void main(String[] args) {

        TreeSet<treeset> obj = new TreeSet<>((s1, s2) -> Integer.compare(s1.age, s2.age));
        // TreeMap<Integer,student>obj=new TreeMap<>();

//        obj.put(12,new student("Shamsi",22,12));
//        obj.put(10,new student("Muhammad",19,10));
//        obj.put(9,new student("Zahro",21,9));
//        obj.put(21,new student("nimo",20,21));

//        System.out.println(obj);
        obj.add(new treeset("Muhammad", 19, 10));
        obj.add(new treeset("Zahro", 21, 9));
        obj.add(new treeset("nimo", 20, 21));
        obj.add(new treeset("rahan", 23, 76));
        obj.add(new treeset("yasir", 19, 22));
        obj.add(new treeset("irfan", 18, 35));
        obj.add(new treeset("Orangzaib", 24, 64));
        obj.add(new treeset("Shamsi", 22, 12));
        treeset from = new treeset("", 19, 0);
        treeset to = new treeset("", 24, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter new student data");
        System.out.println("2. Enter student name to search");
        System.out.println("3. Update student name");
        System.out.println("4. Display all data");
        int choice = 0;
        do {

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    obj.add(new treeset(name, age, id));
                    for(treeset ob:obj){
                        System.out.println(ob);
                    }


                    break;

                case 2:
                    String s = sc.nextLine();
                    boolean found=false;
                    for (treeset search : obj) {
                        if (search.name.equals(s)) {
                            System.out.println("student found" + s);
                            found=true;
                            break;
                        }

                    }
                    if(!found)
                    {
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    String old = sc.nextLine();
                    boolean upda=false;

                    for (treeset search : obj) {
                        if (search.name.equals(old)) {
                            System.out.println("enter name to update");
                            String up = sc.nextLine();
                            search.name = up;
                            System.out.println(old + "updated to" + up);
                            upda=true;
                            break;
                        }
                    }
                    if(!upda)
                    {
                        System.out.println("not any student found");
                    }
                    break;
                case 4:
                    for (treeset data : obj) {
                        System.out.println(data);
                    }
                    break;

            }

        }
        while (choice != 5);


        for (treeset ob : obj.subSet(from, true, to, true)) {
            System.out.println(ob);

        }}
}