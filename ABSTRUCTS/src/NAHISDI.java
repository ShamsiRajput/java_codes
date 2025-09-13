interface AnimalJDADE {

    void eat();
    void sleep();
}

class DogI implements AnimalJDADE {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void sleep() {
        System.out.println("Dog sleeps.");
    }
}

class CatI implements AnimalJDADE {
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    public void sleep() {
        System.out.println("Cat sleeps.");
    }
}

class hasdgua{
    public static void main(String[] args) {
        AnimalJDADE objdog=new DogI();
        AnimalJDADE obcat=new CatI();
        objdog.eat();
        objdog.sleep();
        obcat.eat();
        obcat.sleep();


}
}
