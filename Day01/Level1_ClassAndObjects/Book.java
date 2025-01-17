import java.util.*;
class Book
{
    //create the three variable title, author and price
    String title;
    String author;
    double price;

    Book(String title, String author, double price)//make default constructor and initialize to this keyword
    {
        this.title =title;
        this.author=author;
        this.price=price;
    }
    void bookDetail()  //create method book detail and print the all detail
    {
    System.out.println("Book name :"+ title);
    System.out.println("Book author name :"+author);
    System.out.println("Book price :"+price);
    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        Book book=new Book("Atomic Habits", "Sahil", 499);
        book.bookDetail();
    }
}