public class Product {
    // Static variable to hold the discount percentage for all products
    static double discount = 10.0;

    // Instance variables for product details
    String productName;
    double price;
    int quantity;

    // Final variable to store the unique product ID (cannot be changed)
    final String productID;

    // Constructor to initialize product details
    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to validate and display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 59000.0, 2, "L01");
        Product p2 = new Product("Phone", 18000.0, 5, "P01");

        // Update discount for all products
        Product.updateDiscount(15.0);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}