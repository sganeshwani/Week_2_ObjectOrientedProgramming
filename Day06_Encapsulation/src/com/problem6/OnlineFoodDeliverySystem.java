package com.problem6;
// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

// Interface Discountable
interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; // 10% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied: 10%");
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50; // Additional non-veg charges
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied: 5%");
    }
}

// Main class for Food Delivery System
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Kadai Paneer", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Butter Chicken", 300, 1);

        FoodItem[] items = {vegItem, nonVegItem};

        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable discountable) {
                discountable.getDiscountDetails();
                System.out.println("Price after Discount: " + (item.calculateTotalPrice() - discountable.applyDiscount()));
            }
            System.out.println();
        }
    }
}