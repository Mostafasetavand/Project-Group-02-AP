package Skills;

public class skills {
    private int farmingSkill;  // Farming skill level
    private int fishingSkill;  // Fishing skill level
    private int buildingSkill; // Building skill level
    private int cookingSkill;  // Cooking skill level

    // Constructor to initialize the skills
    public skills() {
        this.farmingSkill = 0;  // Initial skill level for farming is 0
        this.fishingSkill = 0;  // Initial skill level for fishing is 0
        this.buildingSkill = 0; // Initial skill level for building is 0
        this.cookingSkill = 0;  // Initial skill level for cooking is 0
    }

    // Methods to upgrade skills (for example, level up)
    public void levelUpFarming() {
        this.farmingSkill++;
    }

    public void levelUpFishing() {
        this.fishingSkill++;
    }

    public void levelUpBuilding() {
        this.buildingSkill++;
    }

    public void levelUpCooking() {
        this.cookingSkill++;
    }

    // Methods to get current skill levels
    public int getFarmingSkill() {
        return farmingSkill;
    }

    public int getFishingSkill() {
        return fishingSkill;
    }

    public int getBuildingSkill() {
        return buildingSkill;
    }

    public int getCookingSkill() {
        return cookingSkill;
    }

    // Display all skill levels
    public void displaySkills() {
        System.out.println("Farming Skill: " + farmingSkill);
        System.out.println("Fishing Skill: " + fishingSkill);
        System.out.println("Building Skill: " + buildingSkill);
        System.out.println("Cooking Skill: " + cookingSkill);
    }
}
