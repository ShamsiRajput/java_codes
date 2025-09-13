import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

class redo{
    public static void main(String[] args) {

        Stack <String> redo=new Stack<>();
        Stack <String> undo=new Stack<>();
        undo.push("abc");
        undo.push("jhsd");
        undo.push("idhk");
        undo.push("iasdib");
        undo.push("iysdbic");
        undo.push("0wh");
        Scanner input=new Scanner(System.in);
        int type;
        System.out.println("1: for new tap \n2: for undo taps\n3: redo in undo");
        type=input.nextInt();
        if(type==1) {

            System.out.println("ENTER THE CURRENT PAGE:");
            String redoo;

            redoo = input.next();
            redo.push(redoo);
            System.out.println("now current tap:"+ redo);
        } else if (type==2) {


            System.out.println("undo taps: " + undo);


        } else if (type==3) {
            Stack<String>temp=new Stack<>();
String search ;
            System.out.println(undo);
            System.out.println("Select the tap:");
            search=input.next();
            while (!undo.isEmpty()){

                if(undo.peek().equals(search)){


                    System.out.println("now open the tap: "+redo.push(undo.pop()));
                    return;
                }
                  temp.push(undo.pop());




            }
            while(!temp.isEmpty()){

                undo.push(temp.pop());

            }

        }


    }


}