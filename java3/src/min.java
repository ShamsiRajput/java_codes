
import java.util.Scanner;

class min {
    public static void main(String[] args){


       Scanner input=new Scanner(System.in);
       System.out.println("Enter the N:");
       int n;
       n=input.nextInt();
       System.out.println("Enter the Values of array:");

       int[] array=new int[n];
       for(int i=0;i<n;i++){
           System.out.print((i+i)+":");

           array[i]=input.nextInt();

       }

       int [] min=new int[0];
        for(int i=0;i<n;i++){
            if(array[i]<=min[i]){
min[i]=array[i];



            }


        }
        System.out.println("The minimum is:"+ min);


    }


}
