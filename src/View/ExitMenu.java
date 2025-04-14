package View;
import java.util.Scanner;

public class ExitMenu {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to exit the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Exiting game... Goodbye!");
            System.exit(0);  // Exit the application
        } else {
            System.out.println("Returning to main menu...");
        }
    }
}
