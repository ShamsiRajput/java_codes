//// Abstract Class
//abstract class Animal {
//    // Abstract method (no implementation)
//    abstract void sound();
//
//    // Concrete method (with implementation)
//    void eat() {
//        System.out.println("This animal eats food.");
//    }
//}
//
//// Subclass 1
//class Dog extends AnimalJDADE {
//    @Override
//    void sound() {
//        System.out.println("Dog says: Woof Woof");
//    }
//}
//
//// Subclass 2
//class Cat extends AnimalJDADE {
//    @Override
//    void sound() {
//        System.out.println("Cat says: Meow");
//    }
//}
//
//public class abstraction {
//    public static void main(String[] args) {
//        AnimalJDADE dog = new Dog();
//        dog.sound(); // Output: Dog says: Woof Woof
//        dog.eat();   // Output: This animal eats food.
//
//        AnimalJDADE cat = new Cat();
//        cat.sound(); // Output: Cat says: Meow
//        cat.eat();   // Output: This animal eats food.
//}
//}