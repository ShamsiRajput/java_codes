import java.io.*;
import java.util.Scanner;


public class Secret {
    private String pname="zahra";
    public String getPname(){

        return pname;

    }

}
class cnmae extends Secret
{
    void display(){
        System.out.println("this is your family: "+getPname() );

    }


}
class baby{

    public static void main(String [] args){
        cnmae obj=new cnmae();
        obj.display();
    }
}