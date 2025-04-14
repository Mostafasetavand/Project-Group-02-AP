package Tools;

public class Axe extends tool {
    public Axe(int level) {
        super("Axe", 100, level, 15); // Initial cost and efficiency
    }

    @Override
    public void use() {
        System.out.println("Using axe to chop wood.");
        // Implement action logic for axe
    }
}
