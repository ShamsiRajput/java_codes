
import java .util.Scanner;

public class account {

    private int balance,widdrow,diposite;
    Scanner input=new Scanner(System.in);
   public account(){
       System.out.println("Enter the balance:");
       balance=input.nextInt();
       System.out.println("Enter the deposite ammount:");
       diposite=input.nextInt();
       System.out.println("Enter the widdrow ammount:");
       widdrow=input.nextInt();


   }
   public void cashdiposit(){
       balance=balance+=diposite;
       System.out.println("Now balance in your account:"+balance);}
       public void cashwidhdrow(){
       balance=balance-=widdrow;
           System.out.println("after widtdrow ammount in your account:"+balance);

       }



   public static void main(String [] args) {
       account obj=new account();
       obj.cashdiposit();
       obj.cashwidhdrow();



   }
}
