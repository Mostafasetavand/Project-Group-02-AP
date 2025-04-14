package Buildings;

public class ProcessingMachine {
    private String name; // The name of processing machine
    private String type; //type of machine ("Mill", "Oven", "Press")
    private boolean isActive;// position of the car is turned on

    public ProcessingMachine(String name, String type) {
        this.name = name;
        this.type = type;
        this.isActive = false; // پیش‌فرض غیرفعال
    }

    public void activate() {
        isActive = true;
        System.out.println(name + " is now activated.");
    }

    public void deactivate() {
        isActive = false;
        System.out.println(name + " is now deactivated.");
    }

    public void displayMachineInfo() {
        System.out.println("Machine Name: " + name);
        System.out.println("Machine Type: " + type);
        System.out.println("Is Active: " + isActive);
    }
}
