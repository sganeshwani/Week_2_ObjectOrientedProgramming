// Superclass representing a Book
class Book {
    String title;           // Title of the book
    int publicationYear;    // Year the book was published

    // Constructor to initialize Book attributes
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass representing an Author, extends Book
class Author extends Book {
    String name;    // Name of the author
    String bio;     // Short biography of the author

    // Constructor to initialize Author and Book attributes
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override to include Author-specific details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to demonstrate the relationship between Book and Author
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object with book and author details
        Author author = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "One of the most celebrated American novels.");
        // Display complete details of the book and author
        author.displayInfo();
    }
}