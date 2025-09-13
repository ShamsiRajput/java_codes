import java .util.Scanner;
public class sumarr {
    int [] arr=new int[10];

    public sumarr(){
        System.out.println("Enter the Array values:");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=input.nextInt();

        }
    }

    public static void main(String[] args){

    sumarr obj=new sumarr();
        System.out.println("Array values:");
        for(int num:obj.arr){
            System.out.print(num+" ");

        }
    }
}
