public class over {
    public int add(int a,int b){


        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;


    }
    public double add(double a,double b){

        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    public static void main(String[] args){

        over obj=new over();
        System.out.println("Sum of 2 int: "+obj.add(1,3));
        System.out.println("Sum of 3 int: "+obj.add(1,2,3));
        System.out.println("Sum of 2 Double: "+obj.add(3.4,4.67));
        System.out.println("colection of string: "+obj.add("Hello"," world"));




    }


}
