public class rect {

    int height;
    int width;
    rect(int hei,int wid){
        this.height=hei;
        this.width=wid;
    }
    rect createrLargerRec(int factor){

        return new rect(this.width*factor,this.height*factor);

    }

    public int area(){
         return height*width;

    }

    void display(){
        System.out.println("heigth: "+height+ "   width: "+width);


    }
    public static void main(String [] args){

        rect obj=new rect(6,5);
        obj.display();
        System.out.println(obj.area());
        rect obj2=obj.createrLargerRec(4);
        obj2.display();
        System.out.println(obj2.area());



    }


}
