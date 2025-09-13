import java.util.Scanner;



class speed {

    public static void main(String[] args){

float meter,hours,mint,second;
float meter_scd,km_hours,mile_hours;
int meterInMile=1609;


Scanner input=new Scanner(System.in);
System.out.println("Enter the Meter:");
meter=input.nextInt();
System.out.println("Enter the HOURS:");
hours=input.nextInt();
System.out.println("Enter the MINT");
mint=input.nextInt();
System.out.println("Enter the scd:");
second=input.nextInt();
float total_mint,total_scd,total_hrs;
total_mint=((hours*60)+mint+(second/60));
total_scd=((hours*3600)+(mint*60)+second);
total_hrs=(hours+(mint/60)+(second/3600));
System.out.println("Total_mint is "+ total_mint);
meter_scd=meter/total_scd;
System.out.println("Speed in meter second :"+meter_scd );

        float kmInmeter;


        kmInmeter= meter/1000;
km_hours=kmInmeter/total_hrs;
System.out.println("Speed int km hours: "+km_hours );
        float MileInMeter;
        MileInMeter=meter/meterInMile;
mile_hours=MileInMeter/total_hrs;
System.out.println("Speed in miles hours: "+ mile_hours);

        }




}




