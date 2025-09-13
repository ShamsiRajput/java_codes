import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class student {


    String name;
    int age;
    int id;

    student(String name, int age, int id) {

        this.name = name;

        this.age = age;
        this.id = id;
    }

    public String toString() {


        return "name: " + name + ", age: " + age + ", id: " + id;


    }


    public static void main(String[] args) {


        System.out.println("1->o\tAdding a new book title.\n" +
                "2->o\tRemoving a book title.\n" +
                "3->o\tChecking if a specific book is available.\n" +
                "4->o\tDisplaying all book titles in sorted order.\n" +
                "5->o\tFinding all books that start with a specific letter.\n"+"6->o\tFinding for update name:.\n");
        System.out.println("enter the choice:");
        TreeSet<student> obj = new TreeSet<>((s1, s2) -> Integer.compare(s1.age, s2.age));
        //TreeSet<student> obj = new TreeSet<>((s1, s2)->s1.name.compareTo(s2.name));
        // TreeMap<Integer,student>obj=new TreeMap<>();

//        obj.put(12,new student("Shamsi",22,12));
//        obj.put(10,new student("Muhammad",19,10));
//        obj.put(9,new student("Zahro",21,9));
//        obj.put(21,new student("nimo",20,21));

//        System.out.println(obj);
        obj.add(new student("Muhammad", 19, 10));
        obj.add(new student("Zahro", 21, 9));
        obj.add(new student("Nimo", 20, 21));
        obj.add(new student("Rahan", 23, 76));
        obj.add(new student("Yasir", 19, 22));
        obj.add(new student("Yaseen", 19, 22));
        obj.add(new student("Irfan", 18, 35));
        obj.add(new student("Orangzaib", 24, 64));
        obj.add(new student("Shamsi", 22, 12));
//        student from = new student("", 19, 0);
//        student to = new student("", 24, 0);

//        for (student ob : obj.subSet(from, true, to, true)) {
//            System.out.println(ob);
//        }
//        System.out.println();
//        System.out.println();
//

        int type;
        Scanner input = new Scanner(System.in);
        type = input.nextInt();
        if (type == 1) {

            String name;
            int age;
            int id;
            System.out.println("Enter name :");
            name = input.next();
            System.out.println("Enter age :");
            age = input.nextInt();
            System.out.println("Enter the ID: ");
            id = input.nextInt();


            System.out.println("added this data successfully: " + obj.add(new student(name, age, id)));

            System.out.println();
            System.out.println();
            for (student ob : obj) {
                System.out.println(ob);
            }


        } else if (type==2) {
            System.out.println("Enter remove name:");

            String remove=input.next();



            for(student ob:obj){

                if(ob.name.equals(remove)){
                    obj.remove(ob);
                    System.out.println("remove successfully: "+ob);

break;



                }else{

                    System.out.println("not found this name :");
                    break;

                }}
            System.out.println("total data of students:");
                for(student s:obj){

                    System.out.println(s);


                }


            } else if (type==3) {
            System.out.println("Enter the search name:");
            String stu_Name=input.next();
            for(student ob:obj){
                if(ob.name.contains(stu_Name)){

                    System.out.println(ob);
                    break;


                }else{

                    System.out.println("not avail in list:");
                    break;
                }


            }


        } else if (type==4) {
            for(student ob:obj){


                System.out.println(ob);
            }



        } else if (type==5) {
            System.out.println("Enter the letter:");
            char alfa=input.next().charAt(0);
            for(student ob:obj){

                if(ob.name.charAt(0)==alfa){

                    System.out.println(ob);


                }else {


                    System.out.println("this letter is not any name:");
                    break;
                }

            }


        } else if (type==6) {

            System.out.println("Enter the search name:");
            String found = input.next();
            for (student ob : obj) {
                if (ob.name.equals(found)) {
                    System.out.println("founded: " + ob);
                    System.out.println();
                    System.out.println("enter the updated name:");
                    String update = input.next();
                    ob.name = update;
                    System.out.println(found + " update with " + update + " ->" + ob);


                }


            }
            System.out.println("now total data");
            for (student ob : obj) {


                System.out.println(ob);
            }

        }else if(type==7){

            student from = new student("", 19, 0);
            student to = new student("", 22, 0);

        for (student ob : obj.subSet(from, true, to, true)) {
            System.out.println(ob);
        }
        System.out.println();
        System.out.println();



        }
    }}