import java.util.Scanner;

public class min {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int []arr=new int[10];
        System.out.println("Enter the values:");
        for(int i=0;i<10;i++){
            System.out.println(i+1+": ");
          arr[i]=input.nextInt();



        }
        int min=0;
        for(int i=0;i<10;i++){

            if (arr[i]<min){
                min=arr[i];

            }

        }
        System.out.println(min);



    }
}
