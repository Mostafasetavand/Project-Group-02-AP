package View;
import User.*;
import java.util.Scanner;

public class ProfileMenu {

    public void showMenu(UserAccount user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your profile, " + user.getUsername() + "!");
        System.out.println("1. View Profile");
        System.out.println("2. Change Password");
        System.out.println("3. Logout");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // clear the buffer

        switch (choice) {
            case 1:
                System.out.println("Username: " + user.getUsername());
                break;
            case 2:
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("Password updated successfully!");
                break;
            case 3:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
