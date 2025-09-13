
import java.util.ArrayList;
import java.util.List;

class WeatherData
{
    private String id;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(String id, double temperature, double humidity, double pressure)
    {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString()
    {
        return "WeatherData[ID=" + id + ", Temp=" + temperature + ", Humidity=" + humidity + ", Pressure=" + pressure + "]";
    }
}


class WeatherStations
{
    private String id;
    private String location;
    private List<WeatherData> weatherDataList;

    public WeatherStations(String id, String location)
    {
        this.id = id;
        this.location = location;
        this.weatherDataList = new ArrayList<>();
    }

    public void addWeatherData(WeatherData data)
    {
        weatherDataList.add(data);
    }

    public void removeWeatherData(String dataId)
    {
        weatherDataList.removeIf(data -> data.toString().contains(dataId));
    }

    public void displayWeatherData()
    {
        System.out.println("Weather Data for station " + location + ":");
        for (WeatherData data : weatherDataList)
        {
            System.out.println(data);
        }
    }

    @Override
    public String toString()
    {
        return "WeatherStation[ID=" + id + ", Location=" + location + "]";
    }
}
public class WEATHER2
{
    public static void main(String[] args)
    {
        WeatherStations station = new WeatherStations("WS1", "Mountain View");
        WeatherData data1 = new WeatherData("D1", 22.5, 60.0, 1012.1);
        WeatherData data2 = new WeatherData("D2", 24.0, 55.5, 1013.5);

        station.addWeatherData(data1);
        station.addWeatherData(data2);
        station.displayWeatherData();
        station.removeWeatherData("D1");
        System.out.println("\nAfter removing data D1:");
        station.displayWeatherData();
    }
}