package com.problem2;

import java.util.*;

// Abstract and Superclass : Product
abstract class Product{
    private String productId;
    private String name;
    private int price;

    //Constructor
    public Product(String productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //getters and setters for private attributes
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //abstract method to calculate discount, which is to be implemented by subclasses
    abstract void calculateDiscount();

    // Concrete method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    //Method to calculate final price of a product
    abstract void finalPrice();

}
// Interface : Taxable
interface Taxable{

    //methods to be implemented by subclasses
    int calculateTax();
    void getTaxDetails();
}

//Subclass : Electronics
class Electronics extends Product implements Taxable{

    private int tax;
    int discount;

    public Electronics(String productId, String name, int price, int discount, int tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int calculateTax(){
        return getPrice() * getTax()/100;
    }
    //Override getTaxDetails
    @Override
    public void getTaxDetails() {
        System.out.println("Tax applied : " + calculateTax() + " %");
    }
    //Overriding calculateDiscount
    @Override
    void calculateDiscount() {
        System.out.println("Discount : " + discount/100 * getPrice());
    }
    //Calculating final price
    public void finalPrice(){
        System.out.println("MRP : " + (getPrice() + calculateTax() - discount));
    }
}
//Subclass : Clothing
class Clothing extends Product implements Taxable{

    private int tax;
    int discount;

    public Clothing(String productId, String name, int price, int discount , int tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int calculateTax(){
        return getPrice() * (getTax()/100);
    }
    //Overriding getTaxDetails
    @Override
    public void getTaxDetails() {
        System.out.println("Tax applied : " + calculateTax() + " %");
    }
    //Overriding calculateDiscount
    @Override
    void calculateDiscount() {
        System.out.println("Discount : " + discount/100 * getPrice());
    }
    //Calculating final price
    public void finalPrice(){
        System.out.println("MRP : " + (getPrice() + calculateTax() - discount));
    }
}
//Subclass Groceries
class Groceries extends Product implements Taxable{

    private int tax;
    int discount;

    public Groceries(String productId, String name, int price, int discount , int tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
    //method for calculating tax
    public int calculateTax(){
        return getPrice() * (getTax()/100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax applied : " + calculateTax() + " %");
    }

    @Override
    void calculateDiscount() {
        System.out.println("Discount : " + discount/100 * getPrice());
    }

    public void finalPrice(){
        System.out.println("MRP : " + (getPrice() + calculateTax() - discount));
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {

        //Creating product list to contain products
        List<Product> products = new ArrayList<>();

        //Creating different objects for different products
        Product electronicItem = new Electronics("E01", "Television", 45000, 12, 18);
        Product clothingItem = new Clothing("C01", "Jeans", 1000, 8, 5);
        Product groceryItem = new Groceries("G01", "Rice", 100, 6, 3);

        //Adding items to list
        products.add(electronicItem);
        products.add(clothingItem);
        products.add(groceryItem);

        // Display details of all products
        for (Product product : products) {
            System.out.println("Product Details:");
            product.displayDetails();
            product.finalPrice();
            System.out.println();
        }
    }
}
