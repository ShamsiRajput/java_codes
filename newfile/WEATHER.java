import java.util.ArrayList;
inport java.util.List;
class Sensor
{
    private String id;
    private String type;
    private List<Double> readings;

    public Sensor(String id, String type)
    {
        this.id = id;
        this.type = type;
        this.readings = new ArrayList<>();
    }

    public String getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public void addReading(double reading)
    {
        readings.add(reading);
    }

    public List<Double> getReadings()
    {
        return readings;
    }

    @Override
    public String toString()
    {
        return "Sensor[ID=" + id + ", Type=" + type + ", Readings=" + readings + "]";
    }
}

class WeatherStation
{
    private String id;
    private String location;
    private List<Sensor> sensors;

    public WeatherStation(String id, String location)
    {
        this.id = id;
        this.location = location;
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor)
    {
        sensors.add(sensor);
    }

    public void removeSensor(String sensorId)
    {
        sensors.removeIf(sensor -> sensor.getId().equals(sensorId));
    }

    public void displaySensors()
    {
        System.out.println("Sensors at weather station " + location + ":");
        for (Sensor sensor : sensors)
        {
            System.out.println(sensor);
        }
    }

    @Override
    public String toString()
    {
        return "WeatherStation[ID=" + id + ", Location=" + location + "]";
    }
}


public class WEATHER

{
    public static void main(String[] args)
    {
        WeatherStation station = new WeatherStation("WS1", "Mountain View");
        Sensor sensor1 = new Sensor("S1", "Temperature");
        sensor1.addReading(23.5);
        sensor1.addReading(22.0);

        Sensor sensor2 = new Sensor("S2", "Humidity");
        sensor2.addReading(65.2);
        sensor2.addReading(60.0);
        station.addSensor(sensor1);
        station.addSensor(sensor2);
        station.displaySensors();
        station.removeSensor("S1");
        System.out.println("\nAfter removing sensor S1:");
        station.displaySensors();
    }
}
