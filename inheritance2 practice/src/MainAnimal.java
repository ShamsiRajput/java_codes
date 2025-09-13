class Animal{
    void eat(){
        System.out.println("This animal eat food:");
    }
}
class dog extends Animal{
    void bark(){
        super.eat();
        System.out.println("The dog is bark:");
    }

}



public class MainAnimal {


    public static void main(String [] args){
        dog obj=new dog();

        obj.bark();


    }
}
