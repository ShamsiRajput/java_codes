import java.util.TreeSet;

public class book {
    String name;
    int age;
    int id;


    public book(String name,int age, int id){


        this.name=name;
        this.id=id;
        this.age=age;


    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {


        TreeSet<book>obj=new TreeSet<>((s1,s2)-> s1.name.compareTo(s2.name));
        obj.add(new book("shamsi",22,3344));
        System.out.println("add tecket:");
        for(book s:obj) {


            System.out.println(s);
        }
        }








}
