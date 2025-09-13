
import java.util.Scanner;

public class deep{

    private int [] arr;
    deep(int [] arr){
        this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];
        }}
        void display(){
            System.out.println(java.util.Arrays.toString(arr));
        }

        public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        int [] data=new int [5];
            System.out.println("Enter the array of values:");
            for(int i=0;i<5;i++){
                data[i]=input.nextInt();
            }
        deep obj=new deep(data);
            deep objcopy=new deep(obj.arr);
            System.out.println("orignal array: ");
            obj.display();
            System.out.println("COPY ARRAY:");
            objcopy.display();
             objcopy.arr[3]=89;
            objcopy.arr[1]=90;
            System.out.println("after modification in array:");
            objcopy.display();


        }


}