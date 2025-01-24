// Superclass representing a generic Order
class Order {
    String orderId;    // Unique id for the order
    String orderDate;  // Date the order was placed

    // Constructor to initialize Order attributes
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the order status for the base class
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Method to display basic order details
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass representing a ShippedOrder, inherits Order
class ShippedOrder extends Order {
    String trackingNumber; // Tracking number for the shipped order

    // Constructor to initialize ShippedOrder and base Order attributes
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call superclass constructor
        this.trackingNumber = trackingNumber;
    }

    // Override to update the order status for shipped orders
    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    // Display shipped order details
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass representing a DeliveredOrder, extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate; // Date the order was delivered

    // Constructor to initialize DeliveredOrder and parent class attributes
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call parent constructor
        this.deliveryDate = deliveryDate;
    }

    // Override to update the order status for delivered orders
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    // Display delivered order details
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails(); // Call parent method
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to demonstrate multilevel inheritance
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an instance of DeliveredOrder
        DeliveredOrder order1 = new DeliveredOrder("O1", "2025-01-20", "TRK56789", "2025-01-23");
        // Display detailed order information
        order1.displayOrderDetails();
        // Display the current order status
        System.out.println("Order Status: " + order1.getOrderStatus());
    }
}
