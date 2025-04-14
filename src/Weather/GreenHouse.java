package Weather;

public class GreenHouse {
    private boolean isOpen;  // Is the greenhouse open?
    private String plantType; // Type of plants in the greenhouse

    // Constructor
    public GreenHouse() {
        this.isOpen = false; // By default, greenhouse is closed
        this.plantType = "Crops"; // Default plant type is Crops
    }

    // Open the greenhouse
    public void openGreenhouse() {
        this.isOpen = true;
    }

    // Close the greenhouse
    public void closeGreenhouse() {
        this.isOpen = false;
    }

    // Set the type of plants in the greenhouse
    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    // Get the current status of the greenhouse
    public String getGreenhouseStatus() {
        if (isOpen) {
            return "The greenhouse is open with " + plantType + " inside.";
        } else {
            return "The greenhouse is closed.";
        }
    }
}
