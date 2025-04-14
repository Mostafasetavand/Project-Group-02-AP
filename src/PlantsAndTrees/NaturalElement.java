package PlantsAndTrees;  // پکیج PlantsAndTrees

public class NaturalElement {
    private String type;  // نوع عنصر طبیعی (مثل خاک، سنگ، آب)
    private String description;  // توضیحات

    public NaturalElement(String type, String description) {
        this.type = type;
        this.description = description;
    }

    // نمایش اطلاعات عنصر طبیعی
    public void displayInfo() {
        System.out.println("Element Type: " + type + ", Description: " + description);
    }
}
