public class zahra {


    private String name;
    private int age;

    zahra(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void diplay() {
        System.out.println("name: " + name + " age: " + age);
    }


    public static void main(String[] args) {
        zahra obj = new zahra("zhara", 21);
        System.out.println( obj.getName());
        System.out.println(obj.getAge());
         obj.diplay();

    }
}

