
package details;

import pkd1.Vehicles;
public class truck extends Vehicles{
    public truck(String brand, int speed,String fuelType,double engineCapacity) {
        super(brand, speed,fuelType,engineCapacity);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getEngineCapacity() {
        return super.getEngineCapacity();
    }
}
