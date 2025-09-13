
import java.util.Scanner;


public class fuleee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fule=0 ;
        int mileage;
        int max_fule = 15;
        int one_gallon = 24;
        for (int i = 0; i < max_fule; i++) {

            System.out.println("add fule: "+fule++);

        }
        System.out.println("now fuel in car: " + fule);

        System.out.println("Enter the mileage of car:");
        mileage = input.nextInt();
        System.out.println("NOW mileage of your car:" + mileage);
        int total_mile = 24 * 15;
        System.out.println("tah krda mileage: " + total_mile);
        int i = 0;
        int j=max_fule;
        while (i <= total_mile) {
            while(j>0){

                System.out.println(mileage++);


                i++;
                if (i%24==0) {
                    System.out.println("burn fule: -" + j);

--j;
                }





}


        }







    }
}