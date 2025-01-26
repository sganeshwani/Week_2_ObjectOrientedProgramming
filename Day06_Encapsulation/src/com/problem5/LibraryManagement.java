package com.problem5;

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();
}

// Interface Reservable
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Subclass Book
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Simulate availability
    }
}

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        return false; // Simulate unavailability
    }
}

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved successfully.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Simulate availability
    }
}

// Main class for Library Management System
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem book = new Book("B01", "Effective Java", "Joshua Bloch");
        LibraryItem magazine = new Magazine("M01", "Tech Monthly", "John Doe");
        LibraryItem dvd = new DVD("D01", "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable reservable) {
                reservable.reserveItem();
                System.out.println("Availability: " + reservable.checkAvailability());
            }
            System.out.println();
        }
    }
}
