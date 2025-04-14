package Animals;

public class Fishing {
    private boolean isFishing;

    public Fishing() {
        this.isFishing = false;
    }


    public void startFishing() {
        isFishing = true;
        System.out.println("Fishing has started.");
    }


    public void stopFishing() {
        isFishing = false;
        System.out.println("Fishing has stopped.");
    }


    public void displayFishingStatus() {
        if (isFishing) {
            System.out.println("You are currently fishing.");
        } else {
            System.out.println("You are not fishing.");
        }
    }
}
