class Customer {
    String name;
    Product product1;
    Product product2;
 
    public Customer(String name) {
        this.name = name;
    }
    // Method to add products
    public void addProducts(Product p1, Product p2) {
        this.product1 = p1;
        this.product2 = p2;
    }  
}
// Product class 
class Product {
    String name;
    double quantity;
    double pricePerUnit;
    
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    
    public double calculatePrice() {
        return quantity * pricePerUnit;
    }
}

// BillGenerator class
class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        
        // Add price of first product if it exists
        if (customer.product1 != null) {
            total += customer.product1.calculatePrice();
        }    
        // Add price of second product if it exists
        if (customer.product2 != null) {
            total += customer.product2.calculatePrice();
        }
        return total;
    }
    
    public void generateReceipt(Customer customer) {
        System.out.println("Receipt for " + customer.name);
        
        if (customer.product1 != null) {
            System.out.println(customer.product1.name + ": Rs" + 
                             customer.product1.calculatePrice());
        }
        if (customer.product2 != null) {
            System.out.println(customer.product2.name + ": Rs" + 
                             customer.product2.calculatePrice());
        }
        System.out.println("Total: Rs" + calculateTotal(customer));
    }
}
// Main class 
class GroceryStore {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Sahil");
        
        // Create products
        Product apples = new Product("Apples", 2, 3); // 20 kg at Rs3 per kg
        Product milk = new Product("Milk", 1, 2);    // 10 liters at Rs2 per liter
        
        // Add products to customer
        customer.addProducts(apples, milk);
        
        // Create bill generator and generate receipt
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateReceipt(customer);
    }
}