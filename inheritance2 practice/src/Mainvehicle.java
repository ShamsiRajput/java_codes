
class vehicle {
    int wheels;
    String name;
    vehicle(int wheels,String name){
        this.wheels=wheels;
        this.name=name;
    }

    void displayinfo() {
        System.out.println("Vehicle with " + wheels + " wheels");
    }}
    class Car extends vehicle {
        String brand;

        Car(int wheels, String brand,String name) {
            super(wheels,name);

            this.brand = brand;

        }
        void displayinfo() {

            super.displayinfo();
            System.out.println("Brand with " + brand+"  and with name"+name);
        }}



 public class Mainvehicle{
        public static void main(String[] args) {
            Car car = new Car(4, "city"," zahra");
            car.displayinfo();


        }}

