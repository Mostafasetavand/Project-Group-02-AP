package Marketing;  // پکیج Marketing

import java.util.Scanner;

public class ShopMenu {
    private Shop shop;  // مغازه‌ای که منو به آن تعلق دارد

    public ShopMenu(Shop shop) {
        this.shop = shop;
    }

    // نمایش منو و دریافت انتخاب کاربر
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to " + shop.getShopName());
            System.out.println("1. View Products");
            System.out.println("2. Buy Product");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shop.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    scanner.nextLine();  // consume the newline
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    shop.buyProduct(productName, quantity);
                    break;
                case 3:
                    System.out.println("Exiting the shop.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
