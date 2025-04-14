package NPCS;

import java.util.ArrayList;
import java.util.List;

public class NPC {
    private String name;
    private List<String> missions;
    private List<String> gifts;

    public NPC(String name) {
        this.name = name;
        this.missions = new ArrayList<>();
        this.gifts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addMission(String mission) {
        missions.add(mission);
    }


    public void addGift(String gift) {
        gifts.add(gift);
    }


    public void displayMissions() {
        System.out.println(name + "'s Missions:");
        for (String mission : missions) {
            System.out.println("- " + mission);
        }
    }


    public void displayGifts() {
        System.out.println(name + " can accept the following gifts:");
        for (String gift : gifts) {
            System.out.println("- " + gift);
        }
    }


    public void completeMission(String mission) {
        if (missions.contains(mission)) {
            missions.remove(mission);
            System.out.println("Mission '" + mission + "' completed for " + name + ".");
        } else {
            System.out.println("Mission '" + mission + "' not found.");
        }
    }
}
