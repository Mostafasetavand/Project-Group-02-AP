package Energy;

public class EnergyAmount {
    private int currentEnergy;
    private final int maxEnergy;

    // Constructor to initialize the energy system with a max energy value
    public EnergyAmount(int maxEnergy) {

        this.maxEnergy = maxEnergy;
        this.currentEnergy = maxEnergy;  // Start with full energy
    }

    // Method to reduce energy by a specified amount
    public void reduceEnergy(int amount) {
        if (currentEnergy - amount >= 0) {
            currentEnergy -= amount;
            System.out.println("Energy reduced by " + amount + ". Current energy: " + currentEnergy);
        } else {
            System.out.println("Not enough energy to perform this action.");
        }
    }

    // Method to recover energy over time (can be called at the end of each day or period)
    public void recoverEnergy(int amount) {
        if (currentEnergy + amount <= maxEnergy) {
            currentEnergy += amount;
            System.out.println("Energy recovered by " + amount + ". Current energy: " + currentEnergy);
        } else {
            currentEnergy = maxEnergy;
            System.out.println("Energy fully restored. Current energy: " + currentEnergy);
        }
    }

    // Method to simulate fainting if energy runs out
    public void checkForFainting() {
        if (currentEnergy <= 0) {
            System.out.println("Player has fainted due to lack of energy!");
            // Optionally, you can implement a recovery mechanism here, like restoring a part of energy after fainting
            recoverEnergy(10); // Example: Player recovers 10 energy after fainting
        }
    }

    // Getter for current energy
    public int getCurrentEnergy() {
        return currentEnergy;
    }

    // Getter for max energy
    public int getMaxEnergy() {
        return maxEnergy;
    }

    // Method to display current energy
    public void displayEnergy() {
        System.out.println("Current Energy: " + currentEnergy + "/" + maxEnergy);
    }
}
