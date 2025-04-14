package Animals;

import java.util.ArrayList;

public class Cage {
    private String type; // نوع قفس (مثلاً قفس مرغ، قفس خرگوش)
    private  ArrayList<animals> animals; // لیست حیوانات داخل قفس

    public Cage(String type) {
        this.type = type;
        this.animals = new ArrayList<>();
    }

    // افزودن حیوان به قفس
    public void addAnimal(animals animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " added to the cage.");
    }

    // حذف حیوان از قفس
    public void removeAnimal(animals animal) {
        animals.remove(animal);
        System.out.println(animal.getName() + " removed from the cage.");
    }

    // نمایش اطلاعات قفس و حیوانات داخل آن
    public void displayCageInfo() {
        System.out.println("Cage Type: " + type);
        System.out.println("Animals in the cage:");
        for (animals animal : animals) {
            animal.displayInfo();
        }
    }
}
