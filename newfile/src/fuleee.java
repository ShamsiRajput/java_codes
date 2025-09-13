

import java.util.Scanner;
public class fuleee{



    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int fule;
        int mileage;
        int max=15;
        int rang=999999;
        System.out.println("Enter the current fule: ");
        fule=input.nextInt();
        System.out.println(("Enter the mileage:"));
        mileage=input.nextInt();
        int add=1;


        if(fule==max) {
            System.out.println("you cant add the patraol now couse patrole tank is full");
            for(int i=0;i<fule;i++){
                mileage=mileage+=24;
                if(mileage==rang){
                    mileage=0;
                    mileage=mileage+=24;

                System.out.println("use gallan"+(i+1)+" "+mileage);
        }}}
        else{

            fule=fule+=add;
            System.out.println("now patrol in tank: "+ fule);
            for(int i=0;i<fule;i++){
                mileage=mileage+=24;
                if(mileage==rang){
                    mileage=0;
                    mileage=mileage+=24;

                    System.out.println("use gallan"+(i+1)+" "+mileage);


            }}
        }

    }
}