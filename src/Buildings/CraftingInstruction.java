package Buildings;

public class CraftingInstruction {    // for construction
    private String itemName;
    private String description;
    private String[] materials;

    public CraftingInstruction(String itemName, String description, String[] materials) {
        this.itemName = itemName;
        this.description = description;
        this.materials = materials;
    }


    public void displayInstruction() {
        System.out.println("Crafting Item: " + itemName);
        System.out.println("Description: " + description);
        System.out.print("Required Materials: ");
        for (String material : materials) {
            System.out.print(material + " ");
        }
        System.out.println();
    }
}
