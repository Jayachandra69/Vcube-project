package com.dailytasks;

import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Product " + i);

            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product p = new Product(name, price, quantity);

            total += p.getTotalPrice();
        }

        double discount = 0;

        if (total > 5000) {
            discount = total * 0.10;
        }

        double finalBill = total - discount;

        System.out.println("\n----- FINAL BILL -----");
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill: Rs. " + finalBill);

        sc.close();
    }
}