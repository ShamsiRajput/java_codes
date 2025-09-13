public class Shallow {
    int [] arr;

    public Shallow(int [] arr)
    {
        this.arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){

         this.arr[i]=arr[i];

        }

    }

    public void display()
    {
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static void main(String [] args ){
        int [] data = {1,2,3,4,5};
        Shallow obj = new Shallow(data);
        Shallow obj2 = new Shallow(obj.arr);
        obj.display();
        obj2.display();

        obj2.arr[2]=99;
        obj2.display();

    }
}
