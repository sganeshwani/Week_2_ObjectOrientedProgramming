package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Book with title and author
class Book {
    String title; // Title of the book
    String author; // Author of the book

    // Constructor to initialize book details
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Class representing a Library that holds a collection of books
class Library {
    List<Book> books = new ArrayList<>(); // List to store books in the library

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void showBooks() {
        for (Book b : books) { // Iterate through each book in the list
            System.out.println("Book title: " + b.title + "   " + "Book Author: " + b.author);
        }
    }
}

// Main class to demonstrate the Library and Book functionality
public class LibraryAndBooks {
    public static void main(String... args) {
        // Create book instances
        Book book1 = new Book("To kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");

        // Create the first library and add books to it
        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);

        // Create the second library and add books to it
        Library library2 = new Library();
        library2.addBook(book3);
        library2.addBook(book2);

        // Display books in the first library
        System.out.println("Showing the books of Library1: ");
        library1.showBooks();

        // Display books in the second library
        System.out.println("Showing the books of Library2: ");
        library2.showBooks();
    }
}
