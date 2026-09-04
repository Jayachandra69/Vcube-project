package com.javaintro;

public class ShoppingCart {

    // Instance variables
    int items;
    double totalAmount;
    String orderPlaced;

    // Static variable
    static String website = "Pizzahut";

    // Constructor
    ShoppingCart(int items, double totalAmount) {
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderPlaced = "Not Placed";
    }

    // Instance method to add items
    void addItem() {
        items = items + 2;
        totalAmount = totalAmount + 500;
        System.out.println("Items added successfully.");
    }

    // Instance method to place order
    void placeOrder() {
        orderPlaced = "Placed";
        System.out.println("Order placed successfully.");
    }

    // Instance method to display cart details
    void displayCart() {
        System.out.println("Website      : " + website);
        System.out.println("Items        : " + items);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Order Status : " + orderPlaced);
        System.out.println("----------------------------");
    }

    // Static method to change web site name
    static void changeWebsite() {
        website = "Dominos";
    }

    // Static method to display web site name
    static void displayWebsite() {
        System.out.println("Website Name : " + website);
    }

    // Main method
    public static void main(String[] args) {

        // Create two ShoppingCart objects
        ShoppingCart cart1 = new ShoppingCart(3, 750.0);
        ShoppingCart cart2 = new ShoppingCart(5, 1200.0);

        // Display details of both shopping carts
        System.out.println("Initial Cart Details");
        cart1.displayCart();
        cart2.displayCart();

        // Place order for first cart
        cart1.placeOrder();

        // Add items to second cart
        cart2.addItem();

        // Change web site name
        ShoppingCart.changeWebsite();

        // Display updated details
        System.out.println("\nUpdated Cart Details");
        cart1.displayCart();
        cart2.displayCart();

        // Display web site name
        ShoppingCart.displayWebsite();
    }
}