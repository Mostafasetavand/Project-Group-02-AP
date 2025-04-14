package Tools;  // Ensure that the package is correct

import java.util.ArrayList;

public class Inventory {
    private ArrayList<GameTool> tools;  // Use GameTool instead of javax.tools.Tool

    public Inventory() {
        tools = new ArrayList<>();
    }

    // Add tool to the inventory
    public void addTool(GameTool tool) {
        tools.add(tool);
        System.out.println(tool.getName() + " added to inventory.");
    }

    // Remove tool from inventory
    public void removeTool(GameTool tool) {
        tools.remove(tool);
        System.out.println(tool.getName() + " removed from inventory.");
    }

    // Display tools in the inventory
    public void displayInventory() {
        System.out.println("Tools in inventory:");
        for (GameTool tool : tools) {
            tool.displayInfo();  // Now it works because displayInfo() is a valid method in GameTool
        }
    }
}
