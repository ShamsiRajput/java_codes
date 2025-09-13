public class main2 {

int []arr=new int[10];

public static void main(String [] args) {

    main2 obj = new main2();
    obj.arr = new int[]{23, 34, 34, 12, 653, 643, 43, 23, 34, 23};

    for (int i = 0; i < 10; i++) {
        System.out.print(obj.arr[i] + " ");


    }
    System.out.println();
    for(int num:obj.arr){
        System.out.print(num+" ");
    }

}}
