import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
int no;
Scanner input=new Scanner(System.in);

        System.out.println("Enter the no of lights:");
        no= input.nextInt();
        ArrayList<String>name=new ArrayList<>();
        System.out.println("Enter the names");
        for(int i=0;i<no;i++){
            input.add(name[i]);
        }




        System.out.println(name);


    }
}