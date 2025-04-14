package PlantsAndTrees;  // پکیج PlantsAndTrees

public class Plant {
    private String name;
    private int growthTime; // زمان رشد گیاه
    private int health;     // سلامت گیاه

    public Plant(String name, int growthTime, int health) {
        this.name = name;
        this.growthTime = growthTime;
        this.health = health;
    }

    // Method to grow the plant
    public void grow() {
        System.out.println(name + " is growing.");
    }

    // Method to display plant information
    public void displayInfo() {
        System.out.println("Plant: " + name + ", Growth Time: " + growthTime + " days, Health: " + health);
    }

    public boolean getName() {
        return name.equals("Plant");
    }
}
