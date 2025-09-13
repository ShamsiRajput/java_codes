class recursion {

    int fib(int term) {

        if (term == 1) {


            return 0;
        }
        if (term == 2) {

            return 1;
        } else {

            return fib(term - 1) + fib(term - 2);


        }
    }


    int sum(int n) {
        if (n == 0) {


            return 0;
        }
        if (n == 1) {
            return 1;

        } else {

            return n + sum(n - 1);

        }

    }

    int arrsum(int[] arr, int n) {

        if (arr == null || n == 0) {
            return 0;
        }
        if (n == 1) {

            return arr[0];

        } else {

            return arr[n - 1] + arrsum(arr, n - 1);


        }


    }


    public static void main(String[] args) {
        recursion obj = new recursion();
        System.out.println(obj.fib(10));
        System.out.println();
        System.out.println(obj.sum(10));
        int n = 10;
        int[] arr = new int[n];
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println();
        System.out.println(obj.arrsum(arr, n));


    }


}