package Trading;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private Map<String, Integer> inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        System.out.println(quantity + " " + item + " added to " + name + "'s inventory.");
    }

    public void removeItem(String item, int quantity) {
        if (inventory.containsKey(item) && inventory.get(item) >= quantity) {
            inventory.put(item, inventory.get(item) - quantity);
            System.out.println(quantity + " " + item + " removed from " + name + "'s inventory.");
        } else {
            System.out.println("Not enough " + item + " in " + name + "'s inventory.");
        }
    }

    public void displayInventory() {
        System.out.println(name + "'s Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
