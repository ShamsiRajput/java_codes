class Person {
    private String name;
    private int age;

    Person()
    {
        name = "Unknown";
        age = 0;


    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;


    }
    public void display(){

        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }

    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person("Alice",18);
        p2.display();

    }



}