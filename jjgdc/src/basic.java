import java.util.Scanner;

public class basic {
    void sum(int[] num, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + num[i];


        }
        System.out.println(sum);


    }

    void  fact(int values) {
        int fac = 1;
        for (int i = 1; i <=values; i++) {

            System.out.println(i+"*"+values+"="+(i*values));
fac=fac*i;

        }
        System.out.println("factorail of "+values+": "+fac);


    }

int facto(int values){

        if(values==0){
            return 1;


        } else if (values==1) {


            return 1;
        } else  {

            return values*facto(values-1);


        }




}
static int fib(int term){
        if(term==1){
            return 0;
        }
            else if(term==2){
                return 1;

        }
            else{
                return fib(term-1)+ fib(term-2);
        }
}





    public static void main(String[] args) {
    basic obj=new basic();
//    int size=10;
//    int []arr=new int[size];
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter values:");
//   for(int i=0;i<size;i++){
//       arr[i]=input.nextInt();
//
//   }


  //  obj.sum(arr,10);
        System.out.println(obj.facto(5));
        System.out.println(fib(10));
        int fis=0;
        int sec=1;
        int fib;
        int size=10;
        int indx2;
        for(int i=0;i<size;i++){

            fib=fis+sec;
            System.out.println(fib);
            System.out.println(fib);



        }


    }
}
