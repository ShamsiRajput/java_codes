class classP{
    String messange;
    classP(String messange) {
        this.messange = messange;
    }
    void diplay(){
        System.out.println("Parents constructor:"+ messange);
    }


}
class classC extends classP{
    classC(String messange) {
        super(messange);
    }
    void diplay(){
        super.diplay();

        System.out.println("Child constructor:"+messange);


    }


}



public class Mainsuper {

    public static void main(String [] args){
        classC obj=new classC("shmasi");
        obj.diplay();





    }
}
