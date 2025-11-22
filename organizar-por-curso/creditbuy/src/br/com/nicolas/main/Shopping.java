package br.com.nicolas.main;

public class Shopping implements Comparable<Shopping> {
    private String description;
    private double price;

    public Shopping(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "description = '" + description + '\'' +
                ", price = " + price +
                '}';
    }

    @Override
    public int compareTo(Shopping otherShopping) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(otherShopping.price));
    }
}
