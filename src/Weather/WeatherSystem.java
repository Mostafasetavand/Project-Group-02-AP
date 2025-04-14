package Weather;

public class WeatherSystem {
    private String currentWeather;  // Current weather condition
    private boolean thunderstorm;   // Is there a thunderstorm happening?

    // Constructor
    public WeatherSystem() {
        this.currentWeather = "Sunny"; // Default weather is Sunny
        this.thunderstorm = false;    // By default, there's no thunderstorm
    }

    // Set the current weather
    public void setCurrentWeather(String weather) {
        this.currentWeather = weather;
    }

    // Get the current weather
    public String getCurrentWeather() {
        return "Current Weather: " + currentWeather;
    }

    // Check if there is a thunderstorm
    public void startThunderstorm() {
        this.thunderstorm = true;
    }

    // End the thunderstorm
    public void stopThunderstorm() {
        this.thunderstorm = false;
    }

    // Check if there is a thunderstorm
    public boolean isThunderstorm() {
        return thunderstorm;
    }

    // Display thunderstorm status
    public String getThunderstormStatus() {
        if (thunderstorm) {
            return "Thunderstorm is happening!";
        } else {
            return "No thunderstorm.";
        }
    }
}
