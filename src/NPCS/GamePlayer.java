package NPCS;

import java.util.HashMap;
import java.util.Map;

public class GamePlayer {
    private String name;
    private Map<String, Integer> inventory;

    public GamePlayer(String name) {
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

    public void giveGift(NPC npc, String gift) {
        if (inventory.containsKey(gift) && inventory.get(gift) > 0) {
            System.out.println(name + " gives " + gift + " to " + npc.getName());
            inventory.put(gift, inventory.get(gift) - 1);
            npc.addGift(gift);  // NPC now has the gift
        } else {
            System.out.println(name + " doesn't have any " + gift + " to give.");
        }
    }

    public void completeMission(NPC npc, String mission) {
        npc.completeMission(mission);
    }
}
