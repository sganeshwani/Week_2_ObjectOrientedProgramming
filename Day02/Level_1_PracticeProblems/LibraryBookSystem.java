public class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize the book
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a book
        LibraryBookSystem book1 = new LibraryBookSystem("The Enchanted Forest", "Sahil", 350.0, true);

        // Display book details
        book1.displayDetails();

        System.out.println();

        // Try borrowing the book
        book1.borrowBook();
        book1.borrowBook(); // Attempt to borrow again

        System.out.println();

        // Display book details again
        book1.displayDetails();
    }
}
