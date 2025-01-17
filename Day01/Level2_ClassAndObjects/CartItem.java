import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store items
        CartItem[] cartItems = new CartItem[10];
        int itemCount = 0;

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (itemCount == cartItems.length) {
                        System.out.println("Cart is full. Cannot add more items.");
                        break;
                    }
                    // Input details for the new item
                    System.out.print("Enter item name: ");
                    String itemName = input.nextLine();
                    System.out.print("Enter item price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = input.nextInt();

                    // Add item to the cart
                    cartItems[itemCount] = new CartItem(itemName, price, quantity);
                    itemCount++;
                    System.out.println(itemName + " added to the cart.");
                    break;

                case 2:
                    // Remove item from the cart
                    System.out.print("Enter the name of the item to remove: ");
                    String removeItem = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (cartItems[i].itemName.equalsIgnoreCase(removeItem)) {
                            // Shift items to the left to remove the item
                            for (int j = i; j < itemCount - 1; j++) {
                                cartItems[j] = cartItems[j + 1];
                            }
                            itemCount--;
                            found = true;
                            System.out.println(removeItem + " removed from the cart.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(removeItem + " not found in the cart.");
                    }
                    break;

                case 3:
                    // Display all items in the cart
                    if (itemCount == 0) {
                        System.out.println("The cart is empty.");
                    } else {
                        System.out.println("--- Items in the Cart ---");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println("Item: " + cartItems[i].itemName + ", Price: ₹" + cartItems[i].price + ", Quantity: " + cartItems[i].quantity);
                        }
                    }
                    break;

                case 4:
                    // Display the total cost of the cart
                    double totalCost = 0;
                    for (int i = 0; i < itemCount; i++) {
                        totalCost += cartItems[i].getTotalCost();
                    }
                    System.out.println("Total Cost: ₹" + totalCost);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for shopping!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
