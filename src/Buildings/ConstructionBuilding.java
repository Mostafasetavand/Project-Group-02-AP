package Buildings;

public class ConstructionBuilding {
    private String name;
    private String type; // type of Building( "Kitchen", "Workshop", "Factory")
    private boolean isActive;

    public ConstructionBuilding(String name, String type) {
        this.name = name;
        this.type = type;
        this.isActive = false; // پیش‌فرض غیرفعال
    }

    public void activate() {
        isActive = true;
        System.out.println(name + " is now active.");
    }

    public void deactivate() {
        isActive = false;
        System.out.println(name + " is now inactive.");
    }

    public void displayInfo() {
        System.out.println("Building Name: " + name);
        System.out.println("Building Type: " + type);
        System.out.println("Is Active: " + isActive);
    }

    public boolean isActive() {
        return isActive;
    }
}
