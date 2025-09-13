
import java .util.Scanner;


class ifelse {



    public static void main(String [] args){

System.out.println("IF YOU WANT TO LIGHT ON SOO WRITE (on) OTHER OFF FOR (off)");
        String input;
        Scanner my=new Scanner(System.in);
input=my.nextLine();
        boolean light_on=true;



        if(input.equals("on")){
light_on=true;
            System.out.print("Light iS now ON");


        } else if(input.equals("off")) {
            light_on=false;
            System.out.println("Light is now OFF");

        }else{
            System.out.println("wrong input TRY Again:");



        }



    }
}
