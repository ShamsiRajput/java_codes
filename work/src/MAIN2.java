class animal{
    void eat(){
        System.out.println("Animal eat food");

    }


}
class dog extends animal{
    void sound(){
        System.out.println("The dog bark:");
    }

}



public class MAIN2 {

    public static void main(String[] args) {

        dog obj=new dog();
        obj.eat();
        obj.sound();
    }

}
