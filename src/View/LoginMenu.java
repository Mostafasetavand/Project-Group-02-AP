package View;
import User.*;
import java.util.Scanner;

public class LoginMenu {

    public void showMenu(UserManager userManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Game!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        UserAccount user = userManager.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome, " + username); // for enter the game!
        } else {
            System.out.println("Invalid credentials! Try again.");
        }
    }
}
