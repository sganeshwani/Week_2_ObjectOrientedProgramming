public class Book {
    // Public variable: accessible anywhere
    public String ISBN;

    // Protected variable: accessible within the same package and subclasses
    protected String title;

    // Private variable: accessible only within the Book class
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter method for author (allows controlled access)
    public String getAuthor() {
        return author;
    }

    // Setter method for author (allows controlled modification)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    // Additional attribute for EBook
    private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public variable
        System.out.println("Title: " + title); // Accessing protected variable
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book instance
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book1.displayBookDetails();

        // Modify and access the private author variable via methods
        book1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Author: " + book1.getAuthor());

        // Create an EBook instance
        EBook ebook1 = new EBook("978-1-23-456789-0", "Advanced Java", "Alice Brown", 2.5);
        System.out.println();
        ebook1.displayEBookDetails();
    }
}

