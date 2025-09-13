
class parent {
    void display() {
        System.out.println("this from parent:");

    }}

    class child extends parent {
        @Override
        void display() {
            super.display();
            System.out.println("This from child:");
        }




}




public class MainParent {


    public static void main(String[] args){


        parent obj=new child();

        obj.display();


    }

}
