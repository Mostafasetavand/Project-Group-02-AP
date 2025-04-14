package Marketing;  // پکیج Marketing

public class Product {
    private String productName; // نام محصول
    private double price;       // قیمت محصول
    private int quantity;       // تعداد موجود

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // متد برای خرید محصول
    public boolean buyProduct(int quantityToBuy) {
        if (quantity >= quantityToBuy) {
            quantity -= quantityToBuy;
            return true;
        } else {
            System.out.println("Not enough stock available.");
            return false;
        }
    }

    // نمایش اطلاعات محصول
    public void displayInfo() {
        System.out.println("Product Name: " + productName + ", Price: " + price + ", Available Quantity: " + quantity);
    }

    public String getProductName() {
        return "name of this Product is : " + productName;
    }
}
