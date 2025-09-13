import java.util.Scanner;


class array1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of element of aaray:");
        n=input.nextInt();
        int[] Array=new int[n];
        System.out.println("Enter the values of arrays:");
        for(int i=0;i<n;i++){


          System.out.print((i+1)+":");
        Array[i]=input.nextInt();
        }

int sum=0;
        for(int i=0;i<n;i++){

            sum+=Array[i];


        }
System.out.println("Total sum of array: "+sum);
        input.close();


    }
}
