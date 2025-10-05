package br.com.nicolas.main;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your credit card limit: \n");
        double limit = scanner.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        int option = 1;
        while (option != 0) {
            System.out.println("Write the item to purchase");
            String description = scanner.next();
            System.out.println("Write the price");
            double price = scanner.nextDouble();
            Shopping shopping = new Shopping(description, price);
            boolean purchaseMade = creditCard.purchase(shopping);
            if (purchaseMade) {
                System.out.println("Purchase made successfully");
                System.out.println("Write 0 to leave or 1 to continue");
                option = scanner.nextInt();
            } else {
                System.out.println("Insufficient balance");
                option = 0;
            }

        }

        System.out.println("****************************");
        System.out.println("Purchases made");
        Collections.sort(creditCard.getShoppings());
        for (Shopping s : creditCard.getShoppings()) {
            System.out.println(s.getDescription() + " - " + s.getPrice());
        }
        System.out.println("****************************");
        System.out.println("Balance: " + creditCard.getBalance());

    }

}
