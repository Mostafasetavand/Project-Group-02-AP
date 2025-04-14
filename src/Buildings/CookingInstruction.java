package Buildings;

public class CookingInstruction {
    private String dishName;// the name of food
    private String[] ingredients;
    private int cookingTime; // the time of cooking (minutes)

    public CookingInstruction(String dishName, String[] ingredients, int cookingTime) {
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }


    public void displayCookingInstruction() {
        System.out.println("Dish Name: " + dishName);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nCooking Time: " + cookingTime + " minutes.");
    }
}
