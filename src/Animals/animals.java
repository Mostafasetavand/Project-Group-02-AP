package Animals;

public class animals {
    private String name;
    private String species; // نوع حیوان
    private int age;
    private double weight;

    public animals(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // متد برای نمایش اطلاعات حیوان
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
    }

    // متدهای گتر و ستر برای ویژگی‌ها
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
