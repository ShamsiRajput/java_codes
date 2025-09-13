class insert{

    private int[] arr;
    private int size;



    public insert(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void insertAtBig(int values){

        if(size==arr.length){

            System.out.println("array is full!");
            return ;

        }
        for(int i=size;i>0;i--){


            arr[i]=arr[i-1];
        }
        arr[0]=values;
        size++;

    }




}