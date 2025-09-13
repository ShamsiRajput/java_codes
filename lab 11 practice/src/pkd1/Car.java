package pkd1;

public class Car extends Vehicles {
    public String transmissionType;
    protected int noOfDoors;

    public Car(String brand, int speed, String fuelType, double engineCapacity,String transmissionType, int noOfDoors) {
        super(brand, speed,fuelType, engineCapacity);
        this.transmissionType = transmissionType;
        this.noOfDoors = noOfDoors;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("transmission "+transmissionType);

    }
}
