class zahra {
    void display() {
        System.out.println("zahra");
    }

}
class shamsi extends zahra{
    @Override
    void display()
    {
        super.display();
        System.out.println("shamsi");
    }
}

public class temp{
    public static void main(String [] args)
    {
        zahra obj = new shamsi();
        obj.display();
    }

}
