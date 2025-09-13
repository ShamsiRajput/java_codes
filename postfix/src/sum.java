public class sum {

    int sum(int n){

        if(n==0){
            return 0;

        }
        if(n==1){

            return 1;
        }
        else{

            return n+sum(n-1);


        }


    }




    public static void main(String[] args) {
        sum obj=new sum();
        System.out.println( obj.sum(10));

    }

}
