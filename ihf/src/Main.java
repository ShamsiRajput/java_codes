import java.io.*;




class Main{

    void spc( int [] arr,int index,int values){

        for(int i=0;i<index;i++){
            if(i==index) {
                System.out.print(values);
                break;
            }

        }



    }


    public static void main(String[] args) {
        Main obj=new Main();
        int [] arr={1,2,3,4,5,6,};

obj.spc(2,45);

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");

        }


    }



}