import java.util.Scanner;
class calculater {

    public static void main(String[] args) {


        int A, B;
        String inp;


         char temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        A = input.nextInt();
        System.out.println("Enter the value of B:");
        B=input.nextInt();
        System.out.println("Enter the Arathmatic oprater:( +,-.*/) ");
        inp=input.nextLine();
        temp=input.nextLine().charAt(0);
        switch(temp){

            case '+':
            int sum=A+B;
            System.out.println("The sum of A & B "+sum);
break;
            case '-':
            int sub=A-B;
            System.out.println("The sub of A & B "+ sub);
break;

            case '*':

    int mul=A*B;
    System.out.println("The mul of a & B "+mul);

break;


            case '/':
if(B!=0){
    int div=A/B;
    System.out.println("The div of A & B "+ div);
break;}
else{


    System.out.println("oprater error:");
    break;
}
            default:
                System.out.println("Default value:");
                break;
        }


    }
}
