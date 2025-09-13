class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dogs bark");
    }
}

public class GASGIS{
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference
        if (a instanceof Dog) {
            //QUESTION NO (G)
            Dog d = (Dog) a; // Downcasting
            d.bark(); // Accessing child-specific method
        }
    }
}
