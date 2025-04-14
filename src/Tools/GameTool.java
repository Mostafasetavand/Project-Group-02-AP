package Tools;  // Ensure the Tool package is correct

public class GameTool {
    private String name;  // Tool name
    private String type;  // Type of tool (e.g., "Shovel", "Axe", etc.)
    private double cost;  // Tool cost
    private int level;    // Tool level

    public GameTool(String name, String type, double cost, int level) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.level = level;
    }

    // Method to display tool info
    public void displayInfo() {
        System.out.println("Tool Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Cost: " + cost);
        System.out.println("Level: " + level);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }
}
