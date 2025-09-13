
import java.util.Scanner;

public class bank {

    public static void main(String [] args){
        int amount;
        int deposit;
        int woddrow;

        Scanner input=new Scanner (System.in);
        System.out.println("Enter the amout of in your account:");
        amount=input.nextInt();
        System.out.println("how many you depost teh ammont:");

        deposit=input.nextInt();

        System.out.println("how many amony youi widdrow:");
        woddrow=input.nextInt();
        System.out.println("total amont in your account:"+(amount=amount+=deposit));


        System.out.println("widdrow amont:"+ woddrow);
        System.out.println("remining balace :"+(amount=amount-=woddrow));


    }


}
