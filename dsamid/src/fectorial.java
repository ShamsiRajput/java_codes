//class recursion{
//    int fac(int values){
//        if(values==0||values==1){
//            return 1;
//        }else{
//
//            return values*fac(values-1);
//        }}
//int fib(int term){
//        if(term==1){
//            return 0;
//        }
//        else if(term==2) {
//
//
//        return 1;
//        }
//        else{
//
//            return fib(term-1)+fib(term-2);
//
//        }
//
//}
//int sum(int values){
//
//        if(values==0){
//            return 0;
//        }if(values==1){
//
//
//            return 1;
//    }else{
//
//            return values+sum(values-1);
//
//    }
//
//
//}
//
//int sumArr(int []arr,int n){
//        if(arr==null||n==0){
//            return 0;
//
//        }
//        else if(n==1) {
//
//            return arr[0];
//
//        }else
//            return sumArr(arr,n-1)+arr[n-1];
//
//        }
//
//
//int even(int n) {
//    if (n == 0) {
//
//
//        return 0;
//    } else if (n % 2 == 0) {
//
//        System.out.println(n);
//
//    }
//        return even(n - 1);
//    }
//int evenArr(int []arr,int n){
//        if(arr==null||n==0){
//            return 0;
//
//
//        } else if (arr[n]%2==0) {
//
//            System.out.println(arr[n]);
//
//
//        }
//
//    return evenArr(arr,n-1);
//
//    }
//
//    int odd(int n){
//        if(n==0){
//            return 0;
//
//
//        } else if (n%2!=0) {
//            System.out.println(n);
//
//
//        }return odd(n-1);
//
//
//    }
//
//  int oddArr(int []arr,int n){
//        if(arr==null||n==0){
//            return 0;
//
//
//        }else if(arr[n]%2!=0){
//            System.out.println(arr[n]);
//
//
//        }return oddArr(arr,n-1);
//
//
//  }
//
//  int table(int value,int n){
//
//        if(n==0){
//            return 1;
//
//        }
//        else{
//            System.out.println(value+"X"+n+"="+value*n);
//
//
//
//            return table(value, n - 1);
//
//
//        }}
//    public static void main(String[] args) {
//
//        recursion obj=new recursion();
//        System.out.println(obj.fac(5));
//        System.out.println(obj.fib(5));
//        System.out.println(obj.sum(10));
//        int n=10;
//        int [] arr=new int[n];
//        arr=new int[]{1,2,3,4,5,6,7,8,9,10};
//        System.out.println(obj.sumArr(arr,n));
//        System.out.println();
//        obj.even(n);
//
//
//        obj.evenArr(arr,n-1);
//
//        System.out.println("odd num");
//        obj.odd(n);
//        obj.oddArr(arr,n-1);
//        System.out.println("table");
//        obj.table(10,10);
//
//
//    }
//}