import java.util.Scanner;


public class td {


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.println("Enter the values of size:");

        int row;
        System.out.println("Enter the size r0w:");
        row=input.nextInt();
//colm=input.nextInt();
        int[]col=new int[row];
        int [][] arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter the size colm:");

            col[i]=input.nextInt();
             arr=new int[row][col[i]];
        }

        System.out.println("Enter the values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col[i];j++){
                arr[i][j]=input.nextInt();

            }
        }
for(int i=0;i<row;i++){
    for(int j=0;j<col[i];j++){
        System.out.print((arr[i][j])+" ");


    }
    System.out.println();
}



    }
}



