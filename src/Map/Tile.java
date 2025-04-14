package Map;

public class Tile {
    private String material;
    private String content;
    private int x, y;

    // the builder
    public Tile(String material, String content, int x, int y) {
        this.material = material;
        this.content = content;
        this.x = x;
        this.y = y;
    }

    // Access methods
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
