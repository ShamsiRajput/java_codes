 class recursion {
    int even(int n){
        if(n==0){
            return 0;


        } else if (n%2==0) {
            System.out.println(n);

        }

            return even(n - 1);
        }

        int evenArr(int []arr,int n){
        if(arr==null){

            return 0;
        } if(n<0){
return 0;

            } if (arr[n]%2!=0) {
            System.out.println(arr[n]);

        }
                return evenArr(arr, n - 1);


        }
        int table(int values, int n){

        if(n==0){
            return 0;
        } else{
            System.out.println(values+"X"+ n+"="+values*n);


        }return table(values,n-1);


        }


     public static void main(String[] args) {

        recursion obj=new recursion();
        obj.even(10);
        int n=10;
        int[] arr=new int[n];
         System.out.println("array base");
        arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        obj.evenArr(arr,n-1);
         System.out.println("tables");
         obj.table(10,n);

     }

}
