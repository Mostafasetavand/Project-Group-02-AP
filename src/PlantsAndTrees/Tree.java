package PlantsAndTrees;  // پکیج PlantsAndTrees

public class Tree extends Plant {
    private String treeType; // نوع درخت (مثل سیب، بلوط و ...)

    public Tree(String name, int growthTime, int health, String treeType) {
        super(name, growthTime, health); // ارث بری از کلاس Plant
        this.treeType = treeType;
    }

    // Override the grow method to add tree-specific behavior
    @Override
    public void grow() {
        System.out.println("The " + treeType + " tree is growing.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tree Type: " + treeType);
    }
}
