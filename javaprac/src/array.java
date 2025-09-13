import java.util.Scanner;


public class array {
    int n;
    int sum=0;
    int []arr=new int['n'];
    Scanner input=new Scanner(System.in);
   public array(){

        System.out.println("Enter the size of array:");
        n=input.nextInt();

        System.out.println("Enter the Arrays of number:");
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }}

    public void sum(){

       for(int i=0;i<n;i++){
           sum=sum+=arr[i];
       }
        System.out.println(" total sum: "+ sum);

    }


    public void sort(){

       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){

               if(arr[i]<arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;



               }

           }
       }


    }
    public void sort2(){

       for (int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if (arr[i]>arr[j]){

                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;

               }
           }
       }


    }
    public void max(){
       int max=arr[0];
       for(int i=0;i<n;i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }
        System.out.println("maximum values is: "+max);


    }

    public void min(){


       int min=arr[0];
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               min=arr[i];

           }
       }

        System.out.println("minimum values id: "+min);

    }
            public void display () {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + ", ");
                }
            }


            public void table(){
       for(int i=1;i<=10;i++){
          int result=i*n;
           System.out.println(i+"X"+n+" = "+result);
       }
            }


    public static void main(String [] args){

        array obj=new array();
        System.out.println("This is output");
        obj.display();
obj.sum();
obj.sort();

        System.out.println("After sorting:");
obj.display();
obj.sort2();
        System.out.println();
        System.out.println("After sorting:");
        obj.display();
        System.out.println();

        obj.max();

        obj.min();
        obj.table();
    }

}
