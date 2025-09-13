
import java.util.Scanner;

class mode {



    public static void main(String [] args){
        String input;
        char temp;
        System.out.println("1 for (Normal) 2 for (Reading) 3 for (Night) and 4 for (Off):");
        Scanner obj=new Scanner(System.in);

        temp=obj.nextLine().charAt(0);
        switch (temp){
            case '1':
                System.out.println("Normal Mode");
                break;
            case '2':
                System.out.println("Reading Mode");
                break;
            case '3':
                System.out.println("Night Mood");
                break;
            case '4':
                System.out.println("light id OFF:");
                break;
            default:
                System.out.println("SORRY this type (mode) IS NOT available try again:");

break;





        }






    }
}
