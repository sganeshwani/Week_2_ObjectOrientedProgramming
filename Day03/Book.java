public class Book { 

    // Static variable to hold the name of the library for all books
    static String libraryName = "LIB";
    
    // Instance variables for book details
    String title, author;
    
    // Final variable for ISBN, which can't be modified once assigned
    final String isbn;

    // Constructor to initialize title, author, and isbn for each book object
    Book(String title, String author, String isbn){
        this.title = title;      // Assigns the provided title to the instance variable
        this.author = author;    // Assigns the provided author to the instance variable
        this.isbn = isbn;        // Assigns the provided isbn to the final instance variable
    }

    // Method to display book details
    public void displayDetails(){
        // The 'instanceof' check ensures that the object is an instance of the Book class
        if(this instanceof Book){
            // Display the static library name shared by all books
            System.out.println("Library Name" + " : " + libraryName);
            
            // Display the details of the book (title, author, and ISBN)
            System.out.println("Title of the Book" + " : " + title);
            System.out.println("Author" + " : " + author);
            System.out.println("ISBN" + " : " + isbn);
        }
        else{
            // This else block will never be reached in this case since we are calling this method on Book objects
            System.out.println("Not a valid book.");
        }
    }

    // Main method to create Book objects and display their details
    public static void main(String[] args) {
        // Create two Book objects with specified title, author, and ISBN
        Book b1 = new Book("The Enchanted Forest", "Sahil", "RX98765");
        Book b2 = new Book("Jungle Book", "XYZ", "RX12345");

        // Display details for the first book
        b1.displayDetails();

        // Display details for the second book
        b2.displayDetails();
    }
}
