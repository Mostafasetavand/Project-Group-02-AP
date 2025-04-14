package Tools;

public abstract class tool {
    protected String name;
    protected int cost;
    protected int level;
    protected int efficiency;

    // Constructor to initialize the tool
    public tool(String name, int cost, int level, int efficiency) {
        this.name = name;
        this.cost = cost;
        this.level = level;
        this.efficiency = efficiency;
    }

    // Abstract method to use the tool (to be implemented by specific tool classes)
    public abstract void use();

    // Method to display tool info
    public void displayInfo() {
        System.out.println("Tool: " + name);
        System.out.println("Cost: " + cost);
        System.out.println("Level: " + level);
        System.out.println("Efficiency: " + efficiency);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public int getEfficiency() {
        return efficiency;
    }
}
