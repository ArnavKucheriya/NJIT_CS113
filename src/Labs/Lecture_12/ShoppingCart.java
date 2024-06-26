package Labs.Lecture_12;

import java.text.NumberFormat;
import java.lang.*;
public class ShoppingCart
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart; // array of cart items. [] -> Array Type: Objects
// ---------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// ---------------------------------------------------------
    public ShoppingCart()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;

        cart = new Item[capacity];
    }
// -----------------------------------------------------
// Adds an item to the shopping cart.
// -----------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {
        Item item = new Item(itemName, price, quantity);
        if (itemCount == capacity){
            increaseSize();
        }

/*
        if (cart[itemCount]==null){
*/
            cart[itemCount] = item;
            totalPrice += price * quantity;
            itemCount++;
    }
// -----------------------------------------------------
// Returns the contents of the cart together with
// summary information.
// -----------------------------------------------------
public String toString()
{
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String contents = "\nShopping Cart\n";
    contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
    for (int i = 0; i < itemCount; i++)
        contents += cart[i].toString() + "\n";
    contents += "\nTotal Price: " + fmt.format(totalPrice);
    contents += "\n";
    return contents;
}
// -----------------------------------------------------
// Increases the capacity of the shopping cart by 3
// -----------------------------------------------------
    private void increaseSize()
    {
        Item[] temp = new Item[capacity+3];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
        capacity += 3;
    }
}
