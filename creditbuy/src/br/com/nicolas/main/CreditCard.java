package br.com.nicolas.main;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Shopping> shoppings;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppings = new ArrayList<>();
    }

    public boolean purchase(Shopping shopping) {
        if (this.balance > shopping.getPrice()) {
            this.balance -= shopping.getPrice();
            this.shoppings.add(shopping);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Shopping> getShoppings() {
        return shoppings;
    }
}
