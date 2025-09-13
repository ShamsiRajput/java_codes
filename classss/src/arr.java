import java.util.Scanner;
public class arr {

    int  []array=new int[10];
    public arr() {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            array[i] = input.nextInt();
        }
        System.out.print("output ");

                for (int num : array) {
                    System.out.print(num + " ");




        }}
        public static void main (String[]args){
            System.out.println("Enter the values:");
            arr obj = new arr();



        }


    }
