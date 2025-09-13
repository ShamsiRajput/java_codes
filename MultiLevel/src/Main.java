class A{
    protected String name;
     protected int age;
    protected String gender;

    public A(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender= gender;
    }

//    String getName() {
//        return name;
//    }

    public int calculateAge()
    {
        return age;

    }
}

class B extends A {
    private int qualification;

    public B(String name, int age, String gender, int qualification) {
        super(name, age, gender);
        this.qualification = qualification;
    }
    @Override
    public int calculateAge()
    {
        return age;

    }
    public int calculatequalification()
    {
        return qualification ;

    }

}
class C extends B {
    private int hours;

    public C(String name, int age, String gender, int qualification, int hours) {
        super(name, age, gender, qualification);
        this.hours = hours;
    }

    @Override
    public int calculateAge()
    {
        return age;

    }
    public int calculateHours()
    {
        return hours* age;

    }
}
public class Main{
    public static void main(String [] args)
    {
        B b = new B("Manan",18,"Male",12);

        System.out.println("Name: " + b.name + ", Age: " + b.calculateAge() + ", Gender: " + b.gender +
                ", Qualification: " + b.calculatequalification());

        C c = new C("Muhammad",18, "weather not to say",12,34);
        System.out.println("Name: " + c.name + ", Age: " + c.calculateAge() + ", Gender: " + c.gender +
                ", Qualification: " + c.calculatequalification());

    }
}