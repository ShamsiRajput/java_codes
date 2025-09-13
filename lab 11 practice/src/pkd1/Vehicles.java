package pkd1;

public class Vehicles {
     protected String brand;
     int speed;
     public String fuelType;
     private double engineCapacity ;
    public Vehicles(){}
    public Vehicles(String brand, int speed, String fuelType, double engineCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public void displayDetails(){
        System.out.println("brand"+brand);
    }
}
