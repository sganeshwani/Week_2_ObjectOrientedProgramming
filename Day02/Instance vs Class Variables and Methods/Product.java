public class Product {
    // Class variable to store total number of products
    private static int totalProducts = 0;

    // Instance variables
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // Increment the totalProducts count when a new product is created
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method
    public static void main(String[] args) {
        // Create product instances
        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Phone", 800.0);

        // Display details of individual products
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display total products created
        Product.displayTotalProducts();
    }
}

