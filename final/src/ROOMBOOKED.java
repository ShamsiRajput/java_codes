import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class ROOMBOOKED {



    public static void main(String[] args) {

        System.out.println("1->Book a Room\tAssign a guest name to a room if it’s available\n" +
                "2->Cancel Booking\tRemove the guest from the room\n" +
                "3->Check Availability\tList all available (not booked) rooms\n" +
                "4->View Guest List\tList all rooms and which guest is in which room\n" +
                "5->Search Guest\tGiven a guest name, find which room they're staying in\n");
        HashMap<Integer,String> obj=new HashMap<>();
        Scanner input=new Scanner(System.in);

        HashMap<Integer,String>Avail=new HashMap<>();
        for(int i=1;i<=30;i++){

            Avail.put(i,"->no room");}


        System.out.println(Avail);



        System.out.println("enter the choice:");
        int type=input.nextInt();
        if(type==1){

            System.out.println("Enter the room no:");
            int room=input.nextInt();
            while(!Avail.isEmpty()){
                if(Avail.keySet().equals(room)){

                    System.out.println(Avail);


                }




            }



            System.out.println("room no: "+obj);





        }




        

    }

}
