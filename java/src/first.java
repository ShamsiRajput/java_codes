
import java.util.Scanner;
class first {
    public static void main(String[] args){

        int a;
        int b;
        int c,d;
        int g;


        float sum;
        float per;
        Scanner myob=new Scanner(System.in);
        System.out.println("Enter the values of A:");
        a= myob.nextInt();

        System.out.println("Enter the values of B:");
        b= myob.nextInt();
        System.out.println("Enter the value of C:");
        c=myob.nextInt();
        System.out.println("Enter the value of D:");
        d=myob.nextInt();
        System.out.println("Enter the value of E:");
        g=myob.nextInt();
        sum=a+b+c+d+g;
        per=(sum/500)*100;

System.out.println("your persentage is "+ per);
if(per>=80){

    System.out.println("Grade A");

}
else if(per>=70){

    System.out.println("Grade B");


}
else if(per>=60){

    System.out.println("Grade C");
}

else if(per>=50){

    System.out.println("Grade D");



}
else{

    System.out.println("Fail");


}



    }




}
