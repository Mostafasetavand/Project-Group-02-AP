package Tools;

public class Scythe extends tool {
    public Scythe(int level) {
        super("Scythe", 50, level, 10); // Initial cost and efficiency
    }

    @Override
    public void use() {
        System.out.println("Using scythe to cut crops.");
        // Implement action logic for scythe
    }
}
