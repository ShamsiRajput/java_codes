public class ract{
  int a,b;
  public ract(){
      this .a=0;
      this.b=0;}

      public ract(int n){
      this.a=n;
      this.b=n;}
    public ract(int len,int wid) {
        this.a = len;
        this.b = wid;

    }
    public void display(){
        System.out.println("LengthL: "+a+" Width: "+b);}

      public int calArea() {
return a*b;

      }






    public static void main(String[] args)
    {
        ract obj1=new ract();
        obj1.display();
        System.out.println("Area: "+obj1.calArea());


ract obj2=new ract(3);
obj2.display();
        System.out.println("Area: "+ obj2.calArea());


        ract obj3=new ract(3,6);
        obj3.display();
        System.out.println("Area: "+obj3.calArea());



      }

  }











