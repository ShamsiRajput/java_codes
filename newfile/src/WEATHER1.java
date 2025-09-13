import java.util.ArrayList;
import java.util.List;

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
        if (!sensors.contains(sensor))
        {
            sensors.add(sensor);
            sensor.addWeatherStation(this);
        }
    }

    public void removeSensor(Sensor sensor)
    {
        if (sensors.remove(sensor))
        {
            sensor.removeWeatherStation(this);
        }
    }

    public void displaySensors()
    {
        System.out.println("Sensors at weather station " + location + ":");
        for (Sensor sensor : sensors)
        {
            System.out.println(sensor);
        }
    }

    public String getId()
    {
        return id;
    }

    public String getLocation()
    {
        return location;
    }

    @Override
    public String toString()
    {
        return "WeatherStation[ID=" + id + ", Location=" + location + "]";
    }
}
class Sensor
{
    private String id;
    private String type;
    private List<Double> readings;
    private List<WeatherStation> weatherStations;

    public Sensor(String id, String type)
    {
        this.id = id;
        this.type = type;
        this.readings = new ArrayList<>();
        this.weatherStations = new ArrayList<>();
    }

    public void addReading(double reading)
    {
        readings.add(reading);
    }

    public void addWeatherStation(WeatherStation station)
    {
        if (!weatherStations.contains(station))
        {
            weatherStations.add(station);
        }
    }

    public void removeWeatherStation(WeatherStation station)
    {
        weatherStations.remove(station);
    }

    public List<WeatherStation> getWeatherStations()
    {
        return weatherStations;
    }

    public String getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "Sensor[ID=" + id + ", Type=" + type + ", Readings=" + readings + "]";
    }
}
public class WEATHER1
{
    public static void main(String[] args)
    {

        WeatherStation station1 = new WeatherStation("WS1", "Mountain View");
        WeatherStation station2 = new WeatherStation("WS2", "Ocean View");
        Sensor sensor1 = new Sensor("S1", "Temperature");
        sensor1.addReading(23.5);
        sensor1.addReading(22.0);
        Sensor sensor2 = new Sensor("S2", "Humidity");
        sensor2.addReading(65.2);
        sensor2.addReading(60.0);
        station1.addSensor(sensor1);
        station1.addSensor(sensor2);
        station2.addSensor(sensor1);
        station1.displaySensors();
        System.out.println();
        station2.displaySensors();
        System.out.println("\nWeather stations for sensor S1:");
        for (WeatherStation ws : sensor1.getWeatherStations())
        {
            System.out.println("- " + ws.getLocation());
        }
    }
}