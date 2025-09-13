import java.util.Scanner;

class main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the size of row:");
        row = input.nextInt();
        System.out.println("Enter the size of colom:");
        col = input.nextInt();

        System.out.println("Enter the matricL:");
        ;
        int[][] matric = new int[row][col];
        int[][] sec = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matric[i][j] = input.nextInt();


            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matric[i][j] + " ");


            }
            System.out.println();
        }
        System.out.println("Enter the second matic:");
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
            sec[i][j] = input.nextInt();
        }}

        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
            System.out.println(sec[i][j]);
        }}

int [][] res=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for(int k=0;k<row;k++) {

                    res[i][j] = matric[i][j] * sec[j][k];


                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {


                System.out.print(res[i][j]+ " ");

            }
            System.out.println();
        }

    }}