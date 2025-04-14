package PlantsAndTrees;  // پکیج PlantsAndTrees

import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;  // لیستی از گیاهان

    public Garden() {
        plants = new ArrayList<>();
    }

    // اضافه کردن گیاه به باغ
    public void addPlant(Plant plant) {
        plants.add(plant);
        System.out.println(plant.getName() + " has been planted in the garden.");
    }

    // نمایش اطلاعات گیاهان در باغ
    public void displayGarden() {
        System.out.println("Plants in the garden:");
        for (Plant plant : plants) {
            plant.displayInfo();
        }
    }
}
