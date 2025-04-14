package Map;

import java.util.ArrayList;
import java.util.List;

public class MainMap {
    private List<Tile> tiles;  //list of Tile
    private int width, height; //Map dimensions
    // builder
    public MainMap(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new ArrayList<>();
        createMap();
    }
    //build the map with the initial Tile!
    private void createMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // initial content
                String material = "dirt"; //these are example of that say in top line
                String content = "empty";
                tiles.add(new Tile(material, content, i, j));
            }
        }
    }

    // Get Tile base on position
    public Tile getTile(int x, int y) {
        for (Tile tile : tiles) {
            if (tile.getX() == x && tile.getY() == y) {
                return tile;
            }
        }
        return null;  //if the Tile not found
    }

    // change the contents of the tile
    public void changeTileContent(int x, int y, String newContent) {
        Tile tile = getTile(x, y);
        if (tile != null) {
            tile.setContent(newContent);
        }
    }

  // Change  the type of Tile
    public void changeTileMaterial(int x, int y, String newMaterial) {
        Tile tile = getTile(x, y);
        if (tile != null) {
            tile.setMaterial(newMaterial);
        }
    }

    // print the position of map
    public void printMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tile tile = getTile(i, j);
                System.out.print(tile.getContent() + " ");
            }
            System.out.println();
        }
    }
}
