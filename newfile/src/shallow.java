class shallow {

    int[] arr;

    shallow(int[] arr) {
this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        this.arr[i] = arr[i];}
    }
    shallow(){
        this.arr=new int[0];
    }
    shallow setArr(int[]arr ){
        this.arr=arr;
        return this;
    }
    void display(){
        System.out.println(java.util.Arrays.toString(arr));

    }
public static void main(String[] args){
        int []data={2,4,5};
        shallow obj=new shallow();
        obj.setArr(data);
        obj.display();
        shallow obj2=new shallow(obj.arr);
       obj2. display();
       obj2.arr[0]=99;
    obj2.arr[2]=90;
       obj2.display();


}

}