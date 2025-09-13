import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class paneger {


    String name;
    int id;
    int age;

    public paneger(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "paneger{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {

        LinkedList<paneger>ll=new LinkedList<>();
        ll.add(new paneger("zbc",23,23));
        ll.add(new paneger("ghf",547,24));
        ll.add(new paneger("zyure",42,53));
        ll.add(new paneger("oiey",978,93));



        System.out.println(" addition for 1\n remove for 2\n search for 3\n update for 4");


        String name;
        int id;
        int age;

        int tmp;
        Scanner sc=new Scanner(System.in);
        tmp= sc.nextInt();


if(tmp==1){
    System.out.println("name");
           name=sc.next();

         System.out.println("id");
         id=sc.nextInt();

    System.out.println("age");

    age=sc.nextInt();
    ll.add(new paneger(name,id,age));



    for(paneger h:ll){



        System.out.println(h);
    }

} else if (tmp==2) {

    int ind;
    ind=sc.nextInt();
    ll.remove(ind);
    System.out.println(ll);



}


        Collections.sort(ll, Comparator.comparing(u->u.id));
for(paneger p:ll){


    System.out.println(p);
}


    }

}
