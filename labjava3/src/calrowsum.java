class calrowsum {

    public static void rowsum(int[][]ARRAY){

        for(int i=0;i<ARRAY.length;i++){
            int sum=0;

            for(int j=0;j<ARRAY.length;j++){
                sum+=ARRAY[i][j];


            }
            System.out.println((i+1)+" :Array row sum "+sum);

        }



    }


    public static void main(String[] args)
    {
        int [][] array={

                {1,2,3},
                {4,5,6},
                {7,8,9},




        };


        rowsum(array);


    }

}
