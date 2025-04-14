package Marketing;  // پکیج Marketing

public class Transaction {
    private Shop shop;  // مغازه‌ای که تراکنش در آن انجام می‌شود
    private Product product;  // محصول خریداری شده
    private int quantity;     // تعداد محصول خریداری شده

    public Transaction(Shop shop, Product product, int quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    // انجام تراکنش خرید
    public void execute() {
        boolean success = shop.buyProduct(product.getProductName(), quantity);
        if (success) {
            System.out.println("Successfully purchased " + quantity + " of " + product.getProductName());
        } else {
            System.out.println("Purchase failed.");
        }
    }
}
