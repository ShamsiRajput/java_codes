import java.util.*;
import java.util.Comparator;
import java.util.LinkedList;

class shamsi {


    String name;
    int id;
    int age;

    shamsi(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;


    }

    public String toString() {
        return '{' + " name: " + name
                + "  age: " + age +
                " id: " + id + " " + '}';


    }


    public static void main(String[] args) {


        LinkedList<shamsi> ll = new LinkedList<>();
        ll.add(new shamsi("shamsi", 0010, 22));
        ll.add(new shamsi("aryan", 900, 21));
        ll.addFirst(new shamsi("abc", 6334, 55));

        ll.addLast(new shamsi("xyz", 7632, 34));


        ll.set(1, new shamsi("hkas", 45, 56));

        System.out.println("1 for add, 2 for romve");


        ll.set(3, new shamsi("hasugd", 34, 674));


        int count = 0;
        for (shamsi h : ll) {

            System.out.println(h);

            count++;

        }

        System.out.println("total add in list: " + count);


        System.out.println();

        System.out.println("after remove");
        for (shamsi j : ll) {

            System.out.println(j);

        }

        Scanner input = new Scanner(System.in);

        String chang;


        String search;
        search = input.next();
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).name.equals(search)) {

                chang = input.next();
                ll.get(i).name = chang;


            }


        }


        for (int i = 0; i < ll.size(); i++) {
            for (int j = i + 1; j < ll.size(); j++) {
                if (ll.get(i).age > ll.get(j).age) {
                    int temp = ll.get(i).age;
                    ll.get(i).age = ll.get(j).age;
                    ll.get(j).age = temp;


                }
            }

        }
        for (shamsi h : ll) {

            System.out.print(h.age + "  ");

        }

//             for(int i=0;i>obj.size();i++){
//
//                 for(int j=i+1;j<obj.size();j++){
//
//                     if(obj.get(i).name>obj.get(j).name){
//                     String temp=obj.get(i).name;
//                         obj.get(i).name;=obj.get(j).name;
//                         obj.get(j).name=temp;
//
//                 }

        Collections.sort(ll, Comparator.comparing(u -> u.name));
        System.out.println("\nSorted by name:");
        for (shamsi h : ll) {
            System.out.println(h);
        }

        Collections.sort(ll, Comparator.comparing(s -> s.age));
        System.out.println("\nSorted by age:");
        for (shamsi h : ll) {
            System.out.println(h);
        }


//        System.out.println("add for 1,romve for2 search for 3");
//
//        int temp;
//        String name;
//        int id;
//        int age;
//        temp=input.nextInt();
//       if( temp==1){
//
//           System.out.println("name");
//           name=input.next();
//           System.out.println("age");
//           age=input.nextInt();
//           System.out.println("id");
//           id=input.nextInt();
//
//           obj.add(new shamsi(name,age,id));
//
//           for(shamsi h:obj){
//               System.out.println(h);
//           }
//
//
//
//       } else if (temp==2) {
//
//           int ope;
//           int ind;
//           String delname;
//           ope=input.nextInt();
//
//           if(ope==1){
//               System.out.println("enter the indx");
//
//               ind=input.nextInt();
//
//           obj.remove(ind);
//
//           for(shamsi h:obj){
//               System.out.println(h);
//           }} else if (ope==2) {
//               System.out.println("enter name:");
//               delname=input.next();
//               for(int i=0;i<obj.size();i++){
//                   if(obj.get(i).name.equals(delname)){
//
//                       obj.remove(i);
//                       for(shamsi h:obj){
//
//
//                           System.out.println(h);
//                       }
//
//
//                   }
//
//
//
//               }
//
//
//
//           }



    }}


