 class moter  {
    private String name;
   private int age;
    private int year;
    moter (String name, int age ,int year) {
        this.name = name;
        this.age = age;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Animal{name='"+name+","+"age="+age+","+"year="+year+"}";
    }
}

public class Main {
    public static void main(String[] args) {
        moter dog = new moter("Buddy", 5,2019);
        System.out.println(dog); // Calls toString() implicitly
    }
}
