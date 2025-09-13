public class REC {
int length;
int width;
public REC(){

    this.length=0;
    this.width=0;



}
public  REC(int inside ) {
    this.length = inside;
    this.width = inside;


}
public  REC(int a,int b){

    this.length=a;
    this.length=b;


}
public void display(){

    System.out.println("Length: "+length+" width: "+width);


}
public int calcuArea(){
    return length*width;
}


   public static void main(String[] args){

    REC OBJ1=new REC();
    OBJ1.display();
       System.out.println("AREA: "+OBJ1.calcuArea());


REC OBJ2=new REC(6);
OBJ2.display();
       System.out.println("AREA: "+ OBJ2.calcuArea());




   }


    
}
