public class main3{
    int [] arr=new int [10];
    int sum=0;

public main3(){
    arr=new int[]{1,2,3,4,5,6,7,8,9,10};

}
public static void main(String[] args){
        main3 obj=new main3();

for(int num:obj.arr){

    System.out.print(num +" ");
}
for(int num:obj.arr){
    obj.sum=obj.sum+=num;

}
    System.out.print(" = ");
    System.out.print(obj.sum);

}







}