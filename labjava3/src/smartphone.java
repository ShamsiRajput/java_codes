import java.util.Scanner;
public class smartphone {

    public static void main(String[] args){


        String brand,model,call,txt,music,select;
        int battery_life;
        String screen_size;
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the Properties:");
        System.out.println("Enter Brand");
        brand=input.nextLine();
        System.out.println("Enter model:");
        model=input.nextLine();
        System.out.println("Enter the battery life:");
        battery_life=input.nextInt();
        System.out.println("Enter the Screen size:");
        screen_size=input.next();
        System.out.println("Welcome");
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+model);
        System.out.println("Battery Life: "+battery_life);
        System.out.println("Screen Size: "+screen_size);
        System.out.println(" Do You Want To Make a CALL, TEXT OR PLAY MUSIC");

        select=input.next();
        if(select.equals("call")||select.equals("CALL")){

            System.out.println("The Smart phone is now making a call");

        }
        else if(select.equals("text")||select.equals("TEXT"))
        {
            System.out.println("The Smart phone is now sending a text");
        }
        else if(select.equals("music")||select.equals("MUSIC"))
        {
            System.out.println("The Smart phone is now play music");
        }
        else{
            System.out.println("invalid input try again!");
        }

    }


}
