package com.dailytasks;

//1. You are developing a bike rental system for a Company.
//>Each customer can rent multiple bikes.
//>The rental rate depends on the number of hours the bike is used.
//The program must:
//>Take the number of customers as input.
//>For each customer, take the number of bikes they rent.>For each bike, ask for the hours it was rented.
//Calculate the bill for each customer and the total income for the day.> Use a for loop to iterate through customers.
//> Use a while loop to calculate each customer's bill until all their bikes are processed.
//Conditions:
//> Rate per bike per hour= そ50
//> If rental time - 5 hours, apply a 10% discount on that bike's charge.

import java.util.Scanner;

public class BikeRentals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double RATE = 50;
        double totalIncome = 0;

        System.out.print("Enter number of customers : ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter number of bikes rented : ");
            int bikes = sc.nextInt();

            int j = 1;
            double customerBill = 0;

            while (j <= bikes) {

                System.out.print("Enter rental hours for bike " + j + " : ");
                int hours = sc.nextInt();

                double charge = hours * RATE;

                // 10% discount if rental time is 5 hours or more
                if (hours >= 5) {
                    charge = charge - (charge * 10 / 100);
                }

                System.out.println("Bike " + j + " charge = ₹" + charge);

                customerBill = customerBill + charge;

                j++;
            }

            System.out.println("Customer " + i + " bill = ₹" + customerBill);

            totalIncome = totalIncome + customerBill;
        }

        System.out.println("\n==============================");
        System.out.println("Total income for the day = ₹" + totalIncome);
        System.out.println("==============================");

        sc.close();
    }
}