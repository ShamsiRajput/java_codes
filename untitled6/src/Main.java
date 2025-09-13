interface engine{

    void start();
    void stop();

}
abstract class vehicle{
    String brand;
    int speed;
    abstract void accelerete();
    abstract void brake();

}
class car extends vehicle implements engine{
    @Override
    public void start(){
        System.out.println("car is start!");


    }

    @Override
    public void stop(){


        System.out.println("car is stopped!");
    }

    @Override
    void accelerete() {
        System.out.println("the car gain the accelerate!");
    }
    @Override
    void brake(){
        System.out.println("the car is slow slow down the brake!");


    }

}
class bike  extends vehicle implements engine{


    @Override
    public void start(){
        System.out.println("the bike is start!");


    }
    @Override
    public void stop(){
        System.out.println("the bike is stopped!");

    }
    @Override
    void accelerete(){
        System.out.println("the bike now gain the accelereted!");


    }
    @Override
    void brake(){
        System.out.println("the bike now slow slow down the brake!");


    }

}
public class Main{
public static void main(String[] args) {
    bike objBike=new bike();
    car objCar=new car();
    objCar.start();
    objCar.stop();
    objCar.accelerete();
    objCar.brake();

    objBike.start();
    objBike.stop();
    objBike.accelerete();
    objBike.brake();
}
}