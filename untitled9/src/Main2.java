import java.util.*;
import java.io.*;


public class Main2 {

    public static void main(String[] args) {
int people;
int ten_count=0;
        int towanty_count=0;
        int thirty_count=0;
        int fourty_count=0;
        int fifty_count=0;

        Scanner input=new Scanner(System.in);


        System.out.println("how many people:");
        people=input.nextInt();
        int []age=new int[people];
        for(int i=0;i<people;i++){


            age[i]=input.nextInt();
        }
        System.out.println("ages: ");
        for (int i=0;i<age.length;i++){
            System.out.print(age[i]+ " ");

        }
        System.out.println();
for(int i=0;i< age.length;i++){
    if(age[i]>=0&&age[i]<=10){
        ten_count++;

    }
            else if(age[i]>=11&&age[i]<=20){
                towanty_count++;

            }
            else if(age[i]>=21&&age[i]<=30){
                    thirty_count++;

                }

          else  if(age[i]>=31&&age[i]<=40){
                fourty_count++;
            }

        else if (age[i] >= 41 && age[i] <=50) {
            fifty_count++;

        }

    }
        System.out.println("under 1- 10: "+"(" +ten_count+")" );
        System.out.println("under 1- 20: "+"(" +towanty_count+")" );
        System.out.println("under 1- 30: "+"(" +thirty_count+")" );
        System.out.println("under 1- 40: "+"(" +fourty_count+")" );
        System.out.println("under 1- 50:" +"(" +fifty_count+")");






    }}
