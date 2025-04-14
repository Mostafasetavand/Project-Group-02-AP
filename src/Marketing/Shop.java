package Marketing;  // پکیج Marketing

import java.util.ArrayList;

public class Shop {
    private String shopName;  // نام مغازه
    private ArrayList<Product> products;  // لیست محصولات موجود در مغازه

    public Shop(String shopName) {
        this.shopName = shopName;
        products = new ArrayList<>();
    }

    // اضافه کردن محصول به مغازه
    public void addProduct(Product product) {
        products.add(product);
    }

    // نمایش محصولات موجود در مغازه
    public void displayProducts() {
        System.out.println("Products in " + shopName + ":");
        for (Product product : products) {
            product.displayInfo();
        }
    }

    // خرید محصول از مغازه
    public boolean buyProduct(String productName, int quantity) {
        for (Product product : products) {
            if (productName.equals(product.getProductName())) {
                return product.buyProduct(quantity);
            }
        }
        System.out.println("Product not found.");
        return false;
    }

    // متد getter برای نام مغازه
    public String getShopName() {
        return shopName;
    }
}
