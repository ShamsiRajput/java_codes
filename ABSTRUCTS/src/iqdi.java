abstract class Animaldh {
    String name;
    int age;

    public Animaldh(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating.");
    }

}
class Dogs extends Animaldh {
    public Dogs(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cats extends Animaldh {
    public Cats(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
class gen{
    public static void main(String[] args) {
        Animaldh objdog = new Dogs("jourman shfat", 1);
        Animaldh OBJCAT = new Cats("rasian", 2);

        objdog.eat();
        objdog.makeSound();
        OBJCAT.eat();
        OBJCAT.makeSound();
    }
}
