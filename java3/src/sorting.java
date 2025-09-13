
import java.util.Scanner;

class sorting {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
                int n;
        System.out.println("Enter the Value of N:");
        n=input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the valuse of array: ");
        for (int i=0;i<n;i++){

            System.out.print((i+1)+":");
            array[i]=input.nextInt();


        }
        System.out.print("Before sorting:");

        for(int i=0;i<n;i++){

            System.out.print(array[i]+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {

                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }
            }}
        System.out.println("After sorting:");
                for(int i=0;i<n;i++){

                   System.out.print(array[i]+" ");




        }




    }
}
