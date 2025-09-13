import java.util.Scanner;
import java.util.Stack;

class post{


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Stack<Character>ch=new Stack<>();
        Stack<Character>inte=new Stack<>();

        String values;
        System.out.println("Enter the values:");
        values=input.next();
        for(int i=0;i<values.length();i++){
            if(values.charAt(i)=='+'||values.charAt(i)=='-'||values.charAt(i)=='*'||values.charAt(i)=='/'||values.charAt(i)=='^'&&ch.isEmpty()){
                ch.push(values.charAt(i));}
else if(!ch.isEmpty()){

    ch.push(values.charAt(i));
    while(!ch.isEmpty()){




    }

            }


            else{
                inte.push(values.charAt(i));


            }



        }
        System.out.println("opraters:");
        System.out.println(ch);
        System.out.println("oprands");
        System.out.println(inte);



    }
}