import java.util.Scanner;




class arraylist{


    public static void sum(int[] Array, int n){

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+=Array[i];

        }
        System.out.println("Total sum of array is :"+ sum);



    }



    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the N");
        int n;
        n=input.nextInt();
        int [] Array=new int[n];
        System.out.println("Enter the Array:");
        for(int i=0;i<n;i++){
            Array[i]=input.nextInt();

        }
        sum(Array,n);


    }
}