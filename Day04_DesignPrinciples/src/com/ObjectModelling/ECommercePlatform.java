package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Product
class Product {
    String productName; // Name of the product
    double price;       // Price of the product

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void showDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }
}

// Class representing an Order
class Order {
    int orderId; // Unique order ID
    List<Product> products = new ArrayList<>(); // List of products in the order
    double totalAmount; // Total amount of the order

    // Constructor to initialize order ID
    public Order(int orderId) {
        this.orderId = orderId;
        this.totalAmount = 0.0;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.price;
    }

    // Method to display order details
    public void showDetails() {
        System.out.println("Order ID: " + orderId + ", Total Amount: ₹" + totalAmount);
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.showDetails();
        }
    }
}

// Class representing a Customer
class Customer1 {
    String customerName; // Name of the customer
    List<Order> orders = new ArrayList<>(); // List of orders placed by the customer

    // Constructor to initialize customer details
    public Customer1(String customerName) {
        this.customerName = customerName;
    }

    // Method for the customer to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to display customer details and their orders
    public void showDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Orders placed by this customer:");
        for (Order order : orders) {
            order.showDetails();
        }
    }
}

// Main class to demonstrate the e-commerce platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product phone = new Product("Smartphone", 18000);
        Product laptop = new Product("Laptop", 59000);
        Product headphones = new Product("Headphones", 2500);

        // Create a customer
        Customer1 sahil = new Customer1("Sahil");

        // Create orders and add products to them
        Order order1 = new Order(101);
        order1.addProduct(phone);
        order1.addProduct(headphones);

        Order order2 = new Order(102);
        order2.addProduct(laptop);

        // Customer places the orders
        sahil.placeOrder(order1);
        sahil.placeOrder(order2);

        // Display customer details and their orders
        sahil.showDetails();
    }
}