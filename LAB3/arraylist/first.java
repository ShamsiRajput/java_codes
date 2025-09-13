import java. util.Scanner;
class first{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of N");
        n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Values of Array:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("values of array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"+");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+=arr[i];
        }
        System.out.println("="+sum);



    }

}