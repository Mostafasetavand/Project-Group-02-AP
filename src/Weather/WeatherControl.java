package Weather;


public class WeatherControl {
    private WeatherSystem weatherSystem;
    private GreenHouse greenhouse;

    // Constructor
    public WeatherControl() {
        weatherSystem = new WeatherSystem();
        greenhouse = new GreenHouse();
    }

    // Set the current weather
    public void setWeather(String weatherCondition) {
        weatherSystem.setCurrentWeather(weatherCondition);
        System.out.println("Weather updated: " + weatherSystem.getCurrentWeather());
    }

    // Start a thunderstorm
    public void startThunderstorm() {
        weatherSystem.startThunderstorm();
        System.out.println(weatherSystem.getThunderstormStatus());
    }

    // Stop the thunderstorm
    public void stopThunderstorm() {
        weatherSystem.stopThunderstorm();
        System.out.println(weatherSystem.getThunderstormStatus());
    }

    // Open the greenhouse
    public void openGreenhouse() {
        greenhouse.openGreenhouse();
        System.out.println(greenhouse.getGreenhouseStatus());
    }

    // Close the greenhouse
    public void closeGreenhouse() {
        greenhouse.closeGreenhouse();
        System.out.println(greenhouse.getGreenhouseStatus());
    }
}
