import java.util.Scanner;



public class speed {

    public static void main(String [] args){

        Scanner input=new Scanner (System.in);
        double distance;
        double hrs;
        double mint;
        double scd;

        System.out.println("Enter the Distance(in meter) ");
        distance=input.nextInt();
        System.out.println("Enter the houres: ");
        hrs=input.nextInt();
        System.out.println("Enter the mint: ");
        mint=input.nextInt();
        System.out.println("Enter the scd: ");
        scd=input.nextInt();
        double speed_m_s=distance/((hrs*3600)+(mint*60)+scd);
        double speed_k_h=((distance/1000))/(hrs+(mint/60)+(scd/3600));
        double speed_mile_h=((distance/1609))/(hrs+(mint/60)+(scd/3600));

        System.out.println(speed_m_s);
        System.out.println(speed_k_h);
        System.out.println(speed_mile_h);

    }


}
