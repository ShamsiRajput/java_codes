import org.w3c.dom.ls.LSOutput;

public class rectangle {
    int height;
    int width;
    int result;

    public rectangle(int len, int wid) {

        this.height = len;
        this.width = wid;

    }

    public rectangle(int level) {
        this.height = level;
        this.width = level;


    }

    public rectangle() {

        this.height = 0;
        this.width = 0;


    }

    public int area() {
        return height * width;
    }

    public void display() {
        System.out.println("Lenght: " + height + " width: " + width);


    }


    public static void main(String[] args) {


        rectangle obj1 = new rectangle();
        obj1.display();
        System.out.println(obj1.area());

        rectangle obj = new rectangle(2, 3);
        obj.display();
        System.out.println(obj.area());

        rectangle obj3 = new rectangle(4);
        obj3.display();
        System.out.println(obj3.area());

    }

}


