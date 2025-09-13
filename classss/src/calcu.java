import java.util.Scanner;

public class calcu {
    int a,b;
    String ch;



    public int add(int a,int b)
    {
       return a+b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b){


        return a*b;
    }
    public int dic(int a,int b){

        return a/b;

    }
    public calcu(){
        Scanner input=new Scanner(System.in);



        System.out.println("Enter the a:");

        a=input.nextInt();
        System.out.println("Enter teh b:");
        b=input.nextInt();
        System.out.println("what you want(+,-,/*)");
        ch=input.next();



    }
    public static void main(String[] args)

    {
        int result;
        calcu obj=new calcu();

switch(obj.ch){
    case"+":
        result=obj.add(obj.a,obj.b);
        break;
    case"-":
        result=obj.sub(obj.a,obj.b);
        break;
    case"/":
        result=obj.dic(obj.a,obj.b);
        break;
    case"*":
        result=obj.mul(obj.a,obj.b);
    break;

    default:
        System.out.println("invalalid input:");
return;

}
        System.out.println("Result"+result);



    }
}

