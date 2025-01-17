import java.util.*;
class Item
{
    //create the three varible title, author and price
    String itemName;
    String itemCode;
    double Price;

    Item(String itemName, String itemCode, double Price)//make default constructor and initialize to this keyword
    {
        this.itemName =itemName;
        this.itemCode=itemCode;
        this.Price=Price;
    }
    void bookDetail()  //create method book detail and print the all detail
    {
        System.out.println("Item name : "+ itemName);
        System.out.println("Item code is  : "+itemCode);
        System.out.println("item  price is  : "+Price);
    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        Item no_1=new Item("Pen","SKU-001",30);
        no_1.bookDetail();
    }
}