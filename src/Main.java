import map.MainMap;
import map.Tile;

public class Main {
    public static void main(String[] args) {
        // ایجاد نقشه 5x5
        MainMap map = new MainMap(5, 5);

        // چاپ نقشه
        map.printMap();

        // تغییر محتویات یک کاشی
        map.changeTileContent(2, 3, "house");

        // تغییر جنس کاشی
        map.changeTileMaterial(2, 3, "wood");

        // چاپ نقشه بعد از تغییرات
        System.out.println("After changes:");
        map.printMap();
    }
}
